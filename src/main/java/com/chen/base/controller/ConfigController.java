package com.chen.base.controller;

import com.chen.base.entity.Config;
import com.chen.base.entity.FlightFln;
import com.chen.base.service.CalculationService;
import com.chen.base.service.ConfigService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/config")
public class ConfigController {


    @Resource
    ConfigService configService;

    @RequestMapping("/query")
    public List<Config> getConfig() {
        return configService.getAllConfig();
    }

    @RequestMapping("/save")
    public boolean updateConfig(List<Config> configs) {
        return configService.updateConfig(configs);
    }

}
