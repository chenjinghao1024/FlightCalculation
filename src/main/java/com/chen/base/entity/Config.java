package com.chen.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/06/18
 */
@Data
public class Config implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 值
     */
    private BigDecimal value;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}