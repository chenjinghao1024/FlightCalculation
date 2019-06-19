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
public class Airport implements Serializable {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 机场四字代码
     */
    private String identifier;

    /**
     * 
     */
    private BigDecimal latitude;

    /**
     * 
     */
    private BigDecimal longitude;

    /**
     * 
     */
    private BigDecimal elevation;

    /**
     * 
     */
    private String name;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}