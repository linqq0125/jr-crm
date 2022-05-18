package com.corp.jr.dao.generator;


import com.corp.jr.model.generator.CoreRole;
import com.corp.jr.model.generator.CoreRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreRoleDao {
    long countByExample(CoreRoleExample example);

    int deleteByExample(CoreRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreRole record);

    int insertSelective(CoreRole record);

    List<CoreRole> selectByExample(CoreRoleExample example);

    CoreRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreRole record, @Param("example") CoreRoleExample example);

    int updateByExample(@Param("record") CoreRole record, @Param("example") CoreRoleExample example);

    int updateByPrimaryKeySelective(CoreRole record);

    int updateByPrimaryKey(CoreRole record);
}