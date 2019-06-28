package com.chen.base.controller;

import com.chen.base.entity.FlightFln;
import com.chen.base.service.StatisticsService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Administrator
 */
@Controller
public class StatisticsController {

    @Resource
    StatisticsService statisticsService;

    @RequestMapping("/statistics")
    public PageInfo<FlightFln> hello(Date begin, Date end, Integer airportId, Integer airlineId) {
        statisticsService.statistics(begin, end, airportId, airlineId);
        return null;
    }

}
