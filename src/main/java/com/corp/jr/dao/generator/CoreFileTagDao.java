package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CoreFileTag;
import com.corp.jr.model.generator.CoreFileTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreFileTagDao {
    long countByExample(CoreFileTagExample example);

    int deleteByExample(CoreFileTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreFileTag record);

    int insertSelective(CoreFileTag record);

    List<CoreFileTag> selectByExample(CoreFileTagExample example);

    CoreFileTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreFileTag record, @Param("example") CoreFileTagExample example);

    int updateByExample(@Param("record") CoreFileTag record, @Param("example") CoreFileTagExample example);

    int updateByPrimaryKeySelective(CoreFileTag record);

    int updateByPrimaryKey(CoreFileTag record);
}