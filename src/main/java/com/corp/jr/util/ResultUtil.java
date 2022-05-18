package com.corp.jr.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mycomputer on 2022-03-08.
 * 统一返回
 */
public class ResultUtil {

    private String code;
    private String message;
    private Object data;

    public ResultUtil(String code,String message,Object data){
        this.code=code;
        this.message=message;
        this.data=data;

    }

    public static Map resultSuccess(Object data){
//        ResultUtil ru = new ResultUtil(code,message,data);
        Map map = new LinkedHashMap();
        map.put("code","200");
        map.put("mess","success");
        map.put("data",data);
        return map;
    }

    public static Map resultSuccessMess(String message,Object data){
//        ResultUtil ru = new ResultUtil(code,message,data);
        Map map = new LinkedHashMap();
        map.put("code","200");
        map.put("mess",message);
        map.put("data",data);
        return map;
    }

    public static Map resultFailMessage(String message, Object data){
//        ResultUtil ru = new ResultUtil(code,message,data);
        Map map = new HashMap<>();
        map.put("code","-1");
        map.put("mess",message);
        map.put("data",data);
        return map;

    }

    public static Map resultFail(Object data){
//        ResultUtil ru = new ResultUtil(code,message,data);
        Map map = new HashMap<>();
        map.put("code","-1");
        map.put("mess","fail");
        map.put("data",data);
        return map;

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
