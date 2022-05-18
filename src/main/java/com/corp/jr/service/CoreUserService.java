package com.corp.jr.service;

import com.corp.jr.model.generator.CoreUser;
import com.corp.jr.web.query.UserQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by mycomputer on 2021-11-02.
 */

public interface CoreUserService {
    CoreUser selectByPrimaryKey(Integer id);
    List queryUsersMessage(UserQuery condition);
    public Map deleteResult(List<Integer> ids);
    public int addUserMessage(CoreUser coreUser);
    public int updateUserMessage(CoreUser coreUser);
    CoreUser userLogin(CoreUser coreUser);
    public boolean existUser(String code);


}
