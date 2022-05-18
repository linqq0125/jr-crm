package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CoreOrg;
import com.corp.jr.model.generator.CoreOrgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreOrgDao {
    long countByExample(CoreOrgExample example);

    int deleteByExample(CoreOrgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreOrg record);

    int insertSelective(CoreOrg record);

    List<CoreOrg> selectByExample(CoreOrgExample example);

    CoreOrg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreOrg record, @Param("example") CoreOrgExample example);

    int updateByExample(@Param("record") CoreOrg record, @Param("example") CoreOrgExample example);

    int updateByPrimaryKeySelective(CoreOrg record);

    int updateByPrimaryKey(CoreOrg record);
}