package com.corp.jr.controller;

import com.corp.jr.model.generator.CoreUser;
import com.corp.jr.service.CoreUserService;
import com.corp.jr.util.ResultUtil;
import com.corp.jr.util.page.ListPageUtil;
import com.corp.jr.web.JsonResult;
import com.corp.jr.web.query.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mycomputer on 2021-11-02.
 * 登录与注册
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    CoreUserService coreUserService;


    /**
     * 用户登录
     * @param1 用户名
     * @param2 密码
     * @return
     */
    @PostMapping("/login")
    public Map login(@RequestBody CoreUser coreUser) {
        CoreUser cu = coreUserService.userLogin(coreUser);
        if(cu == null){
            return ResultUtil.resultFailMessage("用户名或密码错误!","");
        }
        CoreUser user = coreUserService.selectByPrimaryKey(cu.getId());
        //TODO 登录成功，将用户信息写入到session

        return  ResultUtil.resultSuccess(user);
    }
    /**
     * 用户注册
     * @param
     * @return
     */
    @PostMapping("/register")
    public Map addUserMessage(@RequestBody CoreUser coreUser) {
        boolean cu = coreUserService.existUser(coreUser.getCode());//查询是否已存在，存在：true 不存在：false
        if(cu){
            return ResultUtil.resultFailMessage("用户已存在","");
        }
        //不存在可以注册
        int id = coreUserService.addUserMessage(coreUser);
        return  ResultUtil.resultSuccess(coreUser);
    }
}
