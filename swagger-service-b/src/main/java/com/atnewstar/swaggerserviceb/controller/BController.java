package com.atnewstar.swaggerserviceb.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuKaiKai
 * @date 2019/9/17 9:38
 */
@RestController
public class BController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/service-b")
    @ApiOperation(value = "查询服务名",notes = "从eureka注册中心中查找服务")

    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
    @GetMapping("/v2/api-docs")
    @ApiOperation(value = "获取服务",notes = "获取服务")
    public String dc2() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
