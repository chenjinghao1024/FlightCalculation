package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/06/18
 */
@Data
public class AircraftType implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 飞机类型
     */
    private String acfType;

    /**
     * 中文名称
     */
    private String cnName;

    /**
     * 英文名称
     */
    private String enName;

    /**
     * 发动机
     */
    private String engine;

    /**
     * 载客人数
     */
    private Integer passengerNumber;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}