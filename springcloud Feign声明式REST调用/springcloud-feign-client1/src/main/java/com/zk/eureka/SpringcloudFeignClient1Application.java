package com.zk.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudFeignClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignClient1Application.class, args);
    }

}
