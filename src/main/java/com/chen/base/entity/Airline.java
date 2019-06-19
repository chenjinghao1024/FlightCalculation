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
public class Airline implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String airlineCode;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String country;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}