package com.jiespace.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangmingjie on 2017/10/8.
 */
@RefreshScope
@RestController
public class TestController {
    
    @Value("${form}")
    private String form;
    
    @GetMapping("/form")
    public String form(){
        return this.form;
    }
    
}
