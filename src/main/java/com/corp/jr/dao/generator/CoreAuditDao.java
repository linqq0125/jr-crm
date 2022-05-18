package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CoreAudit;
import com.corp.jr.model.generator.CoreAuditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreAuditDao {
    long countByExample(CoreAuditExample example);

    int deleteByExample(CoreAuditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreAudit record);

    int insertSelective(CoreAudit record);

    List<CoreAudit> selectByExample(CoreAuditExample example);

    CoreAudit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreAudit record, @Param("example") CoreAuditExample example);

    int updateByExample(@Param("record") CoreAudit record, @Param("example") CoreAuditExample example);

    int updateByPrimaryKeySelective(CoreAudit record);

    int updateByPrimaryKey(CoreAudit record);
}