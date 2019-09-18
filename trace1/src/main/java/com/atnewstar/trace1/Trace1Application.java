package com.atnewstar.trace1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Trace1Application {

    public static void main(String[] args) {
        SpringApplication.run(Trace1Application.class, args);
    }

}
