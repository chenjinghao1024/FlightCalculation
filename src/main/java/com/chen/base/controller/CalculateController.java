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
public class CalculateController {
    @Resource
    CalculationService calculationService;

    @RequestMapping("/calculate")
    public PageInfo<FlightFln> hello() {
        calculationService.calculate();
        return null;
    }
}
