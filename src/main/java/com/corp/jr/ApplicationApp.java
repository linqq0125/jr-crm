package com.corp.jr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
//使用springBoot微服务框架
//@ComponentScan(basePackages = {"com.corp.jr.dao.generator",})
@MapperScan("com.corp.jr.dao.generator")
@SpringBootApplication
@EnableCaching
public class ApplicationApp  extends SpringBootServletInitializer  {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationApp.class);
    }

    public static void main(String[] args) {

        SpringApplication.run(ApplicationApp.class, args);
    }



}
//
//@MapperScan("com.corp.jr.mapper.generator")
//@ComponentScan(basePackages = {"com.corp.jr.service","com.corp.jr.dao.generator","com.corp.jr.service.serviceImpl"})
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//public class MainApplication  extends SpringBootServletInitializer  {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(MainApplication.class);
//    }
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(MainApplication.class, args);
//    }
//
//
//
//}
