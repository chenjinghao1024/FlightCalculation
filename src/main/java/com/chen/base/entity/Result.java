package com.chen.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/06/19
 */
@Data
@NoArgsConstructor
public class Result implements Serializable {

    public Result(FlightFln flightFln) {
        this.id = flightFln.getId();
        this.flightId = flightFln.getFlightId();
        this.callsign = flightFln.getCallsign();
        this.acfType = flightFln.getAcfType();
        this.reg = flightFln.getReg();
        this.depAddr = flightFln.getDepAddr();
        this.arrAddr = flightFln.getArrAddr();
        this.etd = flightFln.getEtd();
        this.eta = flightFln.getEta();
        this.atd = flightFln.getAtd();
        this.ata = flightFln.getAta();
        this.flightState = flightFln.getFlightState();
    }

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

    /**
     * 飞机注册号
     */
    private String reg;

    /**
     * 起飞机场
     */
    private String depAddr;

    /**
     * 着陆机场
     */
    private String arrAddr;

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
     * 飞机状态
     */
    private String flightState;

    /**
     * 航空运输业务收入
     */
    private BigDecimal businessIncome;

    /**
     * 燃油消耗费用
     */
    private BigDecimal fuelCost;

    /**
     * 二氧化碳排放费用
     */
    private BigDecimal co2Emissions;

    /**
     * 取消损失
     */
    private BigDecimal cancelLossCost;

    /**
     * 备降/返航损失
     */
    private BigDecimal returnLossCost;

    /**
     * 空中延误损失
     */
    private BigDecimal airDelayLossCost;

    /**
     * 时间价值费用
     */
    private BigDecimal timeValueCost;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}