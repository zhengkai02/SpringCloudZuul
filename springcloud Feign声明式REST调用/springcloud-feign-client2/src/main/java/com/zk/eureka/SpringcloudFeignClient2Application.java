package com.zk.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudFeignClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignClient2Application.class, args);
    }

}
