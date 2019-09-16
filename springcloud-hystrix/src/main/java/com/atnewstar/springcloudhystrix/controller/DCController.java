package com.atnewstar.springcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
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
    @HystrixCommand(fallbackMethod = "error")
    public String dc(){
        return restTemplate.getForObject("http://"+serviceName+"/dc", String.class);
    }
    public String error(){
        return "名字错误或服务已关闭";
    }
}
