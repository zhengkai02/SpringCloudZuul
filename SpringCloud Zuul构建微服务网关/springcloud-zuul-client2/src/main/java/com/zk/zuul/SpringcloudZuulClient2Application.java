package com.zk.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudZuulClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulClient2Application.class, args);
    }

}
