package com.atnewstar.springcloudconfigserver9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServer9002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer9002Application.class, args);
    }

}
