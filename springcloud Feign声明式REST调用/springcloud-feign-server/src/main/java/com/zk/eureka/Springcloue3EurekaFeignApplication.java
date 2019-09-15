package com.zk.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloue3EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloue3EurekaFeignApplication.class, args);
    }

}
