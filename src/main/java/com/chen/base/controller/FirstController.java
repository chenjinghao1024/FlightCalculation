package com.chen.base.controller;

import com.chen.base.entity.FlightFln;
import com.chen.base.service.CalculationService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/first")
public class FirstController {

    @Resource
    CalculationService calculationService;


    @RequestMapping("/hello")
    public PageInfo<FlightFln> hello() {
        calculationService.getDate();
        return null;
    }

}
