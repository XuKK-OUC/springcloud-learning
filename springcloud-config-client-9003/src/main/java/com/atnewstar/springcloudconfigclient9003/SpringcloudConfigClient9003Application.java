package com.atnewstar.springcloudconfigclient9003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient

public class SpringcloudConfigClient9003Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClient9003Application.class, args);
    }

}
