package com.atnewstar.springcloudzuul;

import com.atnewstar.springcloudzuul.filter.MyZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuulApplication {

    @Bean
    public MyZuulFilter getMyZuulFilter(){
        return new MyZuulFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
    }

}
