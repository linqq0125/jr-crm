package com.corp.jr.dao.generator;


import com.corp.jr.model.generator.CoreFunction;
import com.corp.jr.model.generator.CoreFunctionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreFunctionDao {
    long countByExample(CoreFunctionExample example);

    int deleteByExample(CoreFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreFunction record);

    int insertSelective(CoreFunction record);

    List<CoreFunction> selectByExample(CoreFunctionExample example);

    CoreFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreFunction record, @Param("example") CoreFunctionExample example);

    int updateByExample(@Param("record") CoreFunction record, @Param("example") CoreFunctionExample example);

    int updateByPrimaryKeySelective(CoreFunction record);

    int updateByPrimaryKey(CoreFunction record);
}