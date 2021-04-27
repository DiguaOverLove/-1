package com.neu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//在服务启动后自动注册到eureka中
@EnableDiscoveryClient//开启服务发现
public class Provider_8082 {
    public static void main(String[] args) {
        SpringApplication.run(Provider_8082.class,args);
    }
}
