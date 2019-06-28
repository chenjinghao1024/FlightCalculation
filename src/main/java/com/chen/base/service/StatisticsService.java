package com.chen.base.service;

import com.chen.base.mapper.FlightFlnMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Service
public class StatisticsService {

    @Resource
    FlightFlnMapper flightFlnMapper;


    public List<Map> statistics(Date begin, Date end, Integer airportId, Integer airlineId) {

        //select substr(callsign, 1, 3), count(*)
        //from flight_fln
        //where dep_addr/arr_addr = 'ZSPD'
        //group by substr(callsign, 1, 3);


        //select substr(callsign, 1, 3), count(*)
        //from flight_fln
        //where dep_addr/arr_addr = 'ZSPD'
        //  and callsign like 'CSZ%'
        //  and eta is not null
        //  and etd is not null
        //  and flight_state != '取消'
        //group by substr(callsign, 1, 3);

        //select substr(callsign, 1, 3), count(*)
        //from flight_fln
        //where arr_addr = 'ZSPD'
        //  and callsign like 'CSZ%'
        //  and flight_state = '取消'
        //group by substr(callsign, 1, 3)


        return null;
    }

}
