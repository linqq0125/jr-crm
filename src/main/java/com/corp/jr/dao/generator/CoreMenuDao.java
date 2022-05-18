package com.corp.jr.dao.generator;


import com.corp.jr.model.generator.CoreMenu;
import com.corp.jr.model.generator.CoreMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreMenuDao {
    long countByExample(CoreMenuExample example);

    int deleteByExample(CoreMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreMenu record);

    int insertSelective(CoreMenu record);

    List<CoreMenu> selectByExample(CoreMenuExample example);

    CoreMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreMenu record, @Param("example") CoreMenuExample example);

    int updateByExample(@Param("record") CoreMenu record, @Param("example") CoreMenuExample example);

    int updateByPrimaryKeySelective(CoreMenu record);

    int updateByPrimaryKey(CoreMenu record);
}