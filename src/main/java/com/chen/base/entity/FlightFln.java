package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/06/18
 */
@Data
public class FlightFln implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String flightId;

    /**
     * 航空公司呼号
     */
    private String callsign;

    /**
     * 飞机型号
     */
    private String acfType;
    private AircraftType aircraftType;

    /**
     * 飞机注册号
     */
    private String reg;

    /**
     * 起飞机场
     */
    private String depAddr;
    private Airport depAirport;

    /**
     * 着陆机场
     */
    private String arrAddr;
    private Airport arrAirport;

    /**
     * 
     */
    private String yetd;

    /**
     * 
     */
    private String yeta;

    /**
     * 预计起飞时间
     */
    private Date etd;

    /**
     * 预计着陆时间
     */
    private Date eta;

    /**
     * 实际起飞时间
     */
    private Date atd;

    /**
     * 实际着陆时间
     */
    private Date ata;

    /**
     * 
     */
    private String depGateId;

    /**
     * 
     */
    private String arrGateId;

    /**
     * 
     */
    private String orgTimezone;

    /**
     * 
     */
    private String dstTimezone;

    /**
     * 
     */
    private String insertTime;

    /**
     * 
     */
    private String newVersion;

    /**
     * 
     */
    private String updateTime;

    /**
     * 飞机状态
     */
    private String flightState;

    /**
     * 
     */
    private String updateReg;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}