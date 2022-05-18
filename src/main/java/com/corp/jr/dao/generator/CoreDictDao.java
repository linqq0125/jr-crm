package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CoreDict;
import com.corp.jr.model.generator.CoreDictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreDictDao {
    long countByExample(CoreDictExample example);

    int deleteByExample(CoreDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreDict record);

    int insertSelective(CoreDict record);

    List<CoreDict> selectByExample(CoreDictExample example);

    CoreDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreDict record, @Param("example") CoreDictExample example);

    int updateByExample(@Param("record") CoreDict record, @Param("example") CoreDictExample example);

    int updateByPrimaryKeySelective(CoreDict record);

    int updateByPrimaryKey(CoreDict record);
}