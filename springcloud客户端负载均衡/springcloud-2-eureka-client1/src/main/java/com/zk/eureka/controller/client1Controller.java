package com.zk.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class client1Controller {
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id){
        return "the request1 id is: "+id;
    }
}
