package com.corp.jr.service.serviceImpl;

import com.corp.jr.dao.generator.CoreUserDao;
import com.corp.jr.model.generator.CoreUser;
import com.corp.jr.service.CoreUserService;
import com.corp.jr.web.query.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by mycomputer on 2021-11-02.
 */
@Component
public class CoreUserServiceImpl implements CoreUserService{

    @Autowired
    private CoreUserDao coreUserDao;

    @Override
    public CoreUser selectByPrimaryKey(Integer id) {
        /**
         * 因为一个用户可以有多个角色，所以查询出来可能会有多条记录
         */
        String roleName ="";
        List<CoreUser> list = coreUserDao.selectByPrimaryKey(id);
        CoreUser coreUser = list.get(0);
        for(CoreUser cu:list){
            roleName+=cu.getRoleName()+"/";
        }
        coreUser.setRoleName(roleName);
        return coreUser;
    }

    @Override
    public List queryUsersMessage(UserQuery condition) {

        List  pageResult = coreUserDao.queryUsersMessage(condition);
        return pageResult;
    }

    @Override
    public Map deleteResult(List<Integer> ids){
        Map mapResult = new HashMap();
        for (Integer id:ids){
            int re = coreUserDao.deleteByPrimaryKey(id);
            mapResult.put(id,"1".equals(String.valueOf(re))?"success":"fail");
        }
        return mapResult;
    }

    @Override
    public int addUserMessage(CoreUser coreUser) {
        coreUser.setCreateTime(new Date());
        coreUser.setDelFlag((byte) 0);
        int id = coreUserDao.insert(coreUser);
        return id;
    }
    @Override
    public int updateUserMessage(CoreUser coreUser) {
        coreUser.setUpdateTime(new Date());
        int id = coreUserDao.updateByPrimaryKeySelective(coreUser);
        return id;
    }

    @Override
    public CoreUser userLogin(CoreUser coreUser) {
        //TODO 对密码进行解密及校验
        CoreUser coreUser1 = coreUserDao.userLogin(coreUser);
        if(coreUser1 != null){
            return  coreUser1;
        }
        return null;
    }

    @Override
    public boolean existUser(String code) {
        int user =coreUserDao.existUser(code);
        return 0==user?false:true;
    }
}
