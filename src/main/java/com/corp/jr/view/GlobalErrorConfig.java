package com.corp.jr.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;

/**
 * Created by mycomputer on 2021-11-02.
 */
@Configuration
public class GlobalErrorConfig {

    @Bean("error")
    public View error() {
        return new GlobalErrorView();
    }
}

