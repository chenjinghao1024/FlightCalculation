package com.chen.base.mapper;

import com.chen.base.entity.FlightFln;
import com.chen.base.entity.FlightFlnExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FlightFlnMapper {
    /**
     * countByExample
     */
    long countByExample(FlightFlnExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(FlightFlnExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(FlightFln record);

    /**
     * insertSelective
     */
    int insertSelective(FlightFln record);

    /**
     * selectByExample
     */
    List<FlightFln> selectByExample(FlightFlnExample example);

    /**
     * selectByPrimaryKey
     */
    FlightFln selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") FlightFln record, @Param("example") FlightFlnExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") FlightFln record, @Param("example") FlightFlnExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(FlightFln record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(FlightFln record);

    List<FlightFln> selectAll();

}