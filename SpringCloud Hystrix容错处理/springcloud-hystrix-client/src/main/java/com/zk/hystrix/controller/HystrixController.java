package com.zk.hystrix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id){
        return "the request id is"+id;
    }
}
