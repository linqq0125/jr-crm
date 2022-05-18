package com.corp.jr.dao.generator;


import com.corp.jr.model.generator.CoreFile;
import com.corp.jr.model.generator.CoreFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreFileDao {
    long countByExample(CoreFileExample example);

    int deleteByExample(CoreFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreFile record);

    int insertSelective(CoreFile record);

    List<CoreFile> selectByExample(CoreFileExample example);

    CoreFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreFile record, @Param("example") CoreFileExample example);

    int updateByExample(@Param("record") CoreFile record, @Param("example") CoreFileExample example);

    int updateByPrimaryKeySelective(CoreFile record);

    int updateByPrimaryKey(CoreFile record);
}