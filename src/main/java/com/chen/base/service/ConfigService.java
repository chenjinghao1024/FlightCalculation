package com.chen.base.service;

import com.chen.base.entity.Config;
import com.chen.base.entity.ConfigExample;
import com.chen.base.mapper.ConfigMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class ConfigService {

    @Resource
    ConfigMapper configMapper;

    public List<Config> getAllConfig() {
        return configMapper.selectByExample(new ConfigExample());
    }

    public boolean updateConfig(List<Config> configs) {
        for (Config config : configs) {
            configMapper.updateByPrimaryKeySelective(config);
        }
        return true;
    }

}
