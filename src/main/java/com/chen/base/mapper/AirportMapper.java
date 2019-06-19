package com.chen.base.mapper;

import com.chen.base.entity.Airport;
import com.chen.base.entity.AirportExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AirportMapper {
    /**
     * countByExample
     */
    long countByExample(AirportExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(AirportExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(Airport record);

    /**
     * insertSelective
     */
    int insertSelective(Airport record);

    /**
     * selectByExample
     */
    List<Airport> selectByExample(AirportExample example);

    /**
     * selectByPrimaryKey
     */
    Airport selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") Airport record, @Param("example") AirportExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") Airport record, @Param("example") AirportExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(Airport record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(Airport record);
}