package com.zk.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixController {
    @Autowired private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "testError")
    @GetMapping("/test")
    public String test(){
        String result= restTemplate.getForObject("http://dashboard-client/123",String.class);
        System.out.println(result);
        return result;
    }
    public String testError(){
        return "出错之后会返回这里";
    }
}
