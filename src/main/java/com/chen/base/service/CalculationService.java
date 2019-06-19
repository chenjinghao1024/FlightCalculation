package com.chen.base.service;

import com.chen.base.entity.FlightFln;
import com.chen.base.entity.FlightFlnExample;
import com.chen.base.entity.Result;
import com.chen.base.mapper.FlightFlnMapper;
import com.chen.base.mapper.ResultMapper;
import com.chen.base.util.CalculationUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 */
@Service
public class CalculationService {

    @Resource
    FlightFlnMapper flightFlnMapper;

    @Resource
    ResultMapper resultMapper;

    private final static int PAGE_SIZE = 1000;

    public void getDate() {
        PageInfo pageInfo = null;
        /*创建分页工具类*/
        do {
            int pageNumber = 0;
            if (pageInfo != null) {
                pageNumber = pageInfo.getNextPage();
            }
            PageHelper.startPage(pageNumber, PAGE_SIZE);
            List<FlightFln> flightFlns = flightFlnMapper.selectAll();

            pageInfo = new PageInfo<>(flightFlns);

            executors.submit(new TestTask(pageInfo.getList()));

        } while (pageInfo.isHasNextPage() && false);

    }


    /**
     * 创建的线程数理论最优值是cpu核数的2n+1
     */
    private int nThreads =Runtime.getRuntime().availableProcessors() * 2 + 1;

    /**
     * 创建线程池
     */
    private ExecutorService executors = Executors.newFixedThreadPool(nThreads, new ThreadFactory() {

        private final String threadNamePrefix="result_save_thread_";

        //原子性操作，保证每个线程数值的安全性
        private final AtomicInteger count = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(Thread.currentThread().getThreadGroup(),r,threadNamePrefix + count.getAndIncrement());
            t.setDaemon(true);
            return t;
        }
    });

    class TestTask implements Callable<String[]> {

        private List<FlightFln> flns;

        TestTask(List flns) {
            this.flns = flns;
        }

        @Override
        public String[] call() {
            List<Result> results = new ArrayList<>();
            for (FlightFln fln : flns) {

                try {
                    Result result = new Result(fln);

                    if (fln.getDepAirport() != null && fln.getArrAirport() != null) {
                        result.setBusinessIncome(
                                BigDecimal.valueOf(
                                        CalculationUtil.businessIncome(
                                                fln.getDepAirport(), fln.getArrAirport(),
                                                fln.getAircraftType().getPassengerNumber()
                                        )
                                )
                        );
                    }
                    if (result.getAtd() != null && result.getAta() != null) {
                        result.setFuelCost(
                                BigDecimal.valueOf(CalculationUtil.fuelConsumptionCost(result.getAta(), result.getAtd()))
                        );
                        result.setCo2Emissions(
                                BigDecimal.valueOf(CalculationUtil.CO2Emissions(result.getAta(), result.getAtd()))
                        );
                    }
                    if ("取消".equals(result.getFlightState())) {
                        result.setCancelLossCost(BigDecimal.valueOf(CalculationUtil.cancelLossCost()));
                    }

                    if ("备降".equals(result.getFlightState()) || "返航".equals(result.getFlightState())) {
                        result.setReturnLossCost(BigDecimal.valueOf(CalculationUtil.cancelLossCost()));
                    }
                    results.add(result);
                } catch (Exception e) {
                    System.out.println("转换异常"+e.getMessage());
                }
            }

            try {
                int count=resultMapper.bathInsert(results);
            } catch (Exception e) {
                System.out.println("保存异常"+e.getMessage());
            }

            return new String[]{Thread.currentThread().getName(), "down"};
        }
    }
}
