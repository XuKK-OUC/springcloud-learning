package com.atnewstar.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xukaikai
 * @date 2019/9/16 9:38
 */
@RestController
public class DCController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public String dc(){
        List<String> services = discoveryClient.getServices();
        StringBuilder stringBuilder = new StringBuilder();
        for(String s:services){
            stringBuilder.append(s);
            stringBuilder.append("\r\n");
        }
        return stringBuilder.toString();
    }
}
