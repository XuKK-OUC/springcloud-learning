package com.atnewstar.springcloudconfigclient9003.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuKaiKai
 * @date 2019/9/17 11:46
 */
@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String name;
    @RequestMapping("/config")
    public String config(){
        System.out.println("spring.application.name为:"+name);
        return "spring application name为:"+name;
    }
}
