package com.neu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //开启注册中心的服务
public class Eureka_8081 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_8081.class,args);
    }
}
