package com.chen.base.entity.vo;

import com.chen.base.entity.Airline;
import com.chen.base.entity.Airport;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author Administrator
 */
@Data
@ToString
public class StatisticsResultVO implements Serializable {

    /**
     * 机场
     */
    private Airport airport;

    /**
     * 航空公司
     */
    private Airline airline;

    /**
     * 出港航班数量
     */
    private Integer departureFlightCount;
    /**
     * 入港航班数量
     */
    private Integer arrivalFlightCount;

    /**
     * 实际入港航班数量
     */
    private Integer actualArrivalFlightCount;
    /**
     * 实际入港航班数量
     */
    private Integer actualDepartureFlightCount;

    /**
     * 取消航班数量
     */
    private Integer cancelFlightCount;
    /**
     * 航班延误时间
     */
    private BigInteger flightDelayTime;
    /**
     * 航班平均延误时间
     */
    private Double avgFlightDelayTime;
    /**
     * 机场放行正常率
     */
    private Long releaseNormalRate;

    /**
     * 进港延误时间
     */
    private BigInteger delayInArrival;
    /**
     * 平均进港延误时间
     */
    private Double avgDelayInArrival;


}
