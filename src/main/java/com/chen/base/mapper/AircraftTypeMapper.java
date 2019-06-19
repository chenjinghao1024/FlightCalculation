package com.chen.base.mapper;

import com.chen.base.entity.AircraftType;
import com.chen.base.entity.AircraftTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AircraftTypeMapper {
    /**
     * countByExample
     */
    long countByExample(AircraftTypeExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(AircraftTypeExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(AircraftType record);

    /**
     * insertSelective
     */
    int insertSelective(AircraftType record);

    /**
     * selectByExample
     */
    List<AircraftType> selectByExample(AircraftTypeExample example);

    /**
     * selectByPrimaryKey
     */
    AircraftType selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") AircraftType record, @Param("example") AircraftTypeExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") AircraftType record, @Param("example") AircraftTypeExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(AircraftType record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(AircraftType record);
}