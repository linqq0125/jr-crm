package com.corp.jr.dao.generator;


import com.corp.jr.model.generator.CoreRoleMenu;
import com.corp.jr.model.generator.CoreRoleMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreRoleMenuDao {
    long countByExample(CoreRoleMenuExample example);

    int deleteByExample(CoreRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreRoleMenu record);

    int insertSelective(CoreRoleMenu record);

    List<CoreRoleMenu> selectByExample(CoreRoleMenuExample example);

    CoreRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreRoleMenu record, @Param("example") CoreRoleMenuExample example);

    int updateByExample(@Param("record") CoreRoleMenu record, @Param("example") CoreRoleMenuExample example);

    int updateByPrimaryKeySelective(CoreRoleMenu record);

    int updateByPrimaryKey(CoreRoleMenu record);
}