package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CoreUserRole;
import com.corp.jr.model.generator.CoreUserRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreUserRoleDao {
    long countByExample(CoreUserRoleExample example);

    int deleteByExample(CoreUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreUserRole record);

    int insertSelective(CoreUserRole record);

    List<CoreUserRole> selectByExample(CoreUserRoleExample example);

    CoreUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreUserRole record, @Param("example") CoreUserRoleExample example);

    int updateByExample(@Param("record") CoreUserRole record, @Param("example") CoreUserRoleExample example);

    int updateByPrimaryKeySelective(CoreUserRole record);

    int updateByPrimaryKey(CoreUserRole record);
}