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

    @Value("${server.port}")
    private String port;
    @RequestMapping("/config")
    public String config(){
        System.out.println("端口号为:"+port);
        return "端口号"+port;
    }
}
