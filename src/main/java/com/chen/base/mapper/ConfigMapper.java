package com.chen.base.mapper;

import com.chen.base.entity.Config;
import com.chen.base.entity.ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConfigMapper {
    /**
     * countByExample
     */
    long countByExample(ConfigExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(ConfigExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(Config record);

    /**
     * insertSelective
     */
    int insertSelective(Config record);

    /**
     * selectByExample
     */
    List<Config> selectByExample(ConfigExample example);

    /**
     * selectByPrimaryKey
     */
    Config selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(Config record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(Config record);
}