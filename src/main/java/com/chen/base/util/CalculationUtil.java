package com.chen.base.util;

import com.chen.base.entity.Airport;
import lombok.Data;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.PI;

/**
 * @author Administrator
 */
@Data
public class CalculationUtil {

    /**
     * 客座率
     */
    private static double PASSENGER_LOAD_FACTOR = 80.48;
    /**
     * 每座每公里收益 [元/人/公里]
     */
    private static double INCOME_PER_KILOMETER = 0.52;
    /**
     * 燃油消耗 [吨/小时]
     */
    private static double ENERGY_BURN = 2.24;
    /**
     * 燃油成本 [元/吨]
     */
    private static double FUEL_COST = 8110;
    /**
     * 二氧化碳排放系数
     */
    private static double CO2_EMISSION_FACTOR = 3.15;
    /**
     * 二氧化碳排放费用 [元/吨]
     */
    private static double CO2_EMISSIONS = 120;
    /**
     * 航班取消费用[美元]
     */
    private static double CANCEL_LOSS_COST = 31600;
    /**
     * 航班备降/返航经济损失费用 [人民币元]
     */
    private static double RETURN_LOSS_COST = 119400;
    /**
     * 汇率 人民币/美元汇率
     */
    private static double EXCHANGE_RATE = 6.91;
    /**
     * 空中延误经济损失费用 [美元/小时]
     */
    private static double AIR_DELAY_LOSS_COST = 3300;
    /**
     * 旅客时间价值费用 [美元/小时]
     */
    private static double TIME_VALUE_COST = 2173;

    /**
     * 两地距离
     * @param depAirport
     * @param arrAirport
     * @return
     */
    private static double distanceCalculation(Airport depAirport, Airport arrAirport) {
        return distanceCalculation(depAirport.getLatitude().doubleValue(), depAirport.getLongitude().doubleValue(),
                arrAirport.getLatitude().doubleValue(), arrAirport.getLongitude().doubleValue());
    }

    /**
     * 计算距离
     * @param startLatitude 起点维纬度
     * @param startLongitude 起点精度
     * @param endLatitude 重点纬度
     * @param endLongitude 重点经度
     * @return 两地距离(公里)
     */
    public static double distanceCalculation(double startLatitude, double startLongitude,
                                             double endLatitude, double endLongitude) {
        double distance = 6371004 * Math.acos(
                1 - (Math.pow((Math.sin((90 - startLatitude) * PI / 180)
                        * Math.cos(startLongitude * PI / 180)
                        - Math.sin((90 - endLatitude) * PI / 180)
                        * Math.cos(endLongitude * PI / 180)), 2)
                        + Math.pow((Math.sin((90 - startLatitude) * PI / 180)
                        * Math.sin(startLongitude * PI / 180)
                        - Math.sin((90 - endLatitude) * PI / 180)
                        * Math.sin(endLongitude * PI / 180)), 2)
                        + Math.pow((Math.cos((90 - startLatitude) * PI / 180) - Math.cos((90 - endLatitude) * PI / 180)), 2)
                ) / 2);
        return distance / 1000.0;
    }

    /**
     *
     * @param distance 距离(要求单位 [公里])
     * @param seatCount 座位总数
     * @return 业务收入
     */
    public static double businessIncome(Airport depAirport,Airport arrAirport, int seatCount) {
        return distanceCalculation(depAirport, arrAirport) * seatCount * (PASSENGER_LOAD_FACTOR / 100) * INCOME_PER_KILOMETER;
    }


    /**
     *
     * @param startTime 实际起飞时间
     * @param endTime 实际落地时间
     * @return 空中飞行时间
     */
    public static double flightTime(Date startTime, Date endTime) {
        long flightTime = startTime.getTime() - endTime.getTime();
        return flightTime / (60.0 * 60 * 60 * 1000);
    }

    /**
     * 航空燃油消耗费用
     * @param startTime 起飞时间
     * @param endTime 降落时间
     * @return 航空燃油消耗费用
     */
    public static double fuelConsumptionCost(Date startTime, Date endTime) {
        return flightTime(startTime, endTime) * ENERGY_BURN * FUEL_COST;
    }

    /**
     * 二氧化碳排放费用
     * @param flightTime
     * @return
     */
    public static double CO2Emissions(Date startTime, Date endTime) {
        return flightTime(startTime, endTime) * ENERGY_BURN * CO2_EMISSION_FACTOR * CO2_EMISSIONS;
    }

    /**
     * 延误时间
     * @param actualTime 实际起飞时间
     * @param estimatedTime 预计起飞时间
     * @return 延误时间
     */
    public static double delayTime(Date actualTime, Date estimatedTime) {
        long delayTime = actualTime.getTime() - estimatedTime.getTime();
        double delayMin = delayTime / (60.0 * 60 * 100);
        if (delayMin > 15) {
            return delayMin / 60.0;
        }else {
            return 0;
        }
    }

    /**
     * 航班取消损失
     * @return 航班取消损失
     */
    public static double cancelLossCost(){
        return CANCEL_LOSS_COST * EXCHANGE_RATE;
    }

    /**
     * 航班返航/备降损失
     * @return 航班返航/备降损失
     */
    public static double returnLossCost(){
        return RETURN_LOSS_COST;
    }

    /**
     * 空中延误损失
     * @return
     */
    public static double airDelayLossCost(Date actualTime, Date estimatedTime) {
        return delayTime(actualTime, estimatedTime) * AIR_DELAY_LOSS_COST * EXCHANGE_RATE;
    }

    /**
     * TODO: 确认延误总时间
     * 旅客时间价值费用
     * @return
     */
    public static double timeValueCost(Date actualTime, Date estimatedTime) {
        return delayTime(actualTime, estimatedTime) * TIME_VALUE_COST * EXCHANGE_RATE;
    }

}
