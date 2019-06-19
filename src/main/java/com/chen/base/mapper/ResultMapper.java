package com.chen.base.mapper;

import com.chen.base.entity.Result;
import com.chen.base.entity.ResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ResultMapper {
    /**
     * countByExample
     */
    long countByExample(ResultExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(ResultExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(Result record);

    /**
     * insertSelective
     */
    int insertSelective(Result record);

    /**
     * selectByExample
     */
    List<Result> selectByExample(ResultExample example);

    /**
     * selectByPrimaryKey
     */
    Result selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") Result record, @Param("example") ResultExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(Result record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(Result record);

    int bathInsert(List<Result> results);
}