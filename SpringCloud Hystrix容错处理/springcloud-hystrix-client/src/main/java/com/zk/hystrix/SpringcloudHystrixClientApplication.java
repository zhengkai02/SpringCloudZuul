package com.zk.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudHystrixClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixClientApplication.class, args);
    }

}
