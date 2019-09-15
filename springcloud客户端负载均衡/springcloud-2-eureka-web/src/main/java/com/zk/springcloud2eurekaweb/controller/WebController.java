package com.zk.springcloud2eurekaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.logging.Logger;

@RestController
public class WebController {
    Logger logger=Logger.getLogger("log");
    @Autowired private RestTemplate restTemplate;
    @Autowired private LoadBalancerClient loadBalancerClient;
    @GetMapping("/test")
    public String test(){
        String result=restTemplate.getForObject("http://ribbon-client/123",String.class);
        System.out.println(result);
        logger.info("the test result is "+result);
        return result;
    }
    @GetMapping("/test2")
    public String test2(){
        ServiceInstance serviceInstance=loadBalancerClient.choose("ribbon-client");
        String result=serviceInstance.getServiceId()+" : "+serviceInstance.getHost()+" : "+serviceInstance.getPort();
        System.out.println(result);
        logger.info("the test2 result is "+result);
        return result;
    }

}
