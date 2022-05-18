package com.corp.jr.dao.generator;


import com.corp.jr.model.generator.CoreRoleFunction;
import com.corp.jr.model.generator.CoreRoleFunctionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreRoleFunctionDao {
    long countByExample(CoreRoleFunctionExample example);

    int deleteByExample(CoreRoleFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreRoleFunction record);

    int insertSelective(CoreRoleFunction record);

    List<CoreRoleFunction> selectByExample(CoreRoleFunctionExample example);

    CoreRoleFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreRoleFunction record, @Param("example") CoreRoleFunctionExample example);

    int updateByExample(@Param("record") CoreRoleFunction record, @Param("example") CoreRoleFunctionExample example);

    int updateByPrimaryKeySelective(CoreRoleFunction record);

    int updateByPrimaryKey(CoreRoleFunction record);
}