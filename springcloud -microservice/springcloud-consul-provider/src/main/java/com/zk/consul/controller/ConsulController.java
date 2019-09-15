package com.zk.consul.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {
    @Value("${server.port}")
    String port;
    @GetMapping("/health")
    public String home(@RequestParam String name){
        return "hi"+name+",i am from port："+port;
    }
}
