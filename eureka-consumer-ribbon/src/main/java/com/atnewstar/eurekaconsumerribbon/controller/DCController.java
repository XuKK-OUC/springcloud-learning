package com.atnewstar.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Xukaikai
 * @date 2019/9/16 10:09
 */
@RestController
public class DCController {
    @Autowired
    private RestTemplate restTemplate;

    private static  final String serviceName = "eureka-client";
    @RequestMapping("/consumer")
    public String dc(){
        return restTemplate.getForObject("http://"+serviceName+"/dc", String.class);
    }
}
