package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CmsBlog;
import com.corp.jr.model.generator.CmsBlogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsBlogDao {
    long countByExample(CmsBlogExample example);

    int deleteByExample(CmsBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsBlog record);

    int insertSelective(CmsBlog record);

    List<CmsBlog> selectByExample(CmsBlogExample example);

    CmsBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsBlog record, @Param("example") CmsBlogExample example);

    int updateByExample(@Param("record") CmsBlog record, @Param("example") CmsBlogExample example);

    int updateByPrimaryKeySelective(CmsBlog record);

    int updateByPrimaryKey(CmsBlog record);
}