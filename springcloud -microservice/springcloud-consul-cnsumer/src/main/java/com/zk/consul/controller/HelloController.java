package com.zk.consul.controller;

import com.zk.consul.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }
    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }

}
