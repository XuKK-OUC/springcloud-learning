package com.atnewstar.trace2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Trace2Application {

    public static void main(String[] args) {
        SpringApplication.run(Trace2Application.class, args);
    }

}
