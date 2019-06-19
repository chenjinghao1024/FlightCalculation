package com.chen.base.mapper;

import com.chen.base.entity.Airline;
import com.chen.base.entity.AirlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AirlineMapper {
    /**
     * countByExample
     */
    long countByExample(AirlineExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(AirlineExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(Airline record);

    /**
     * insertSelective
     */
    int insertSelective(Airline record);

    /**
     * selectByExample
     */
    List<Airline> selectByExample(AirlineExample example);

    /**
     * selectByPrimaryKey
     */
    Airline selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") Airline record, @Param("example") AirlineExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") Airline record, @Param("example") AirlineExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(Airline record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(Airline record);
}