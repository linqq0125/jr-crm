package com.corp.jr.dao.generator;

import com.corp.jr.model.generator.CoreUser;
import com.corp.jr.model.generator.CoreUserExample;
import com.corp.jr.web.query.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoreUserDao {
    long countByExample(CoreUserExample example);

    int deleteByExample(CoreUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreUser record);

    int insertSelective(CoreUser record);

    List<CoreUser> selectByExample(CoreUserExample example);

    List<CoreUser> selectByPrimaryKey(Integer id);

    List queryUsersMessage(@Param("params") UserQuery params);

    int updateByExampleSelective(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    int updateByExample(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    int updateByPrimaryKeySelective(CoreUser record);

    int updateByPrimaryKey(CoreUser record);

    CoreUser userLogin(CoreUser coreUser);
    public int existUser(String code);
}