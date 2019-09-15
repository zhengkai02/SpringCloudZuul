package com.zk.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id){
        return "the request2 id is:"+id;
    }
}
