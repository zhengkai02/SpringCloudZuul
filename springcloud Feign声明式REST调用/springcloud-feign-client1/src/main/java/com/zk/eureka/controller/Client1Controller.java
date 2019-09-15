package com.zk.eureka.controller;

import com.zk.eureka.VO.TestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {
    @GetMapping("/{id}")
    public String getMessage(@PathVariable Long id){
        return "the request2 id is: "+id;
    }
    @GetMapping("/post")
    public String post(@RequestBody TestParam testParam){
        return "testParam  1: "+testParam.toString();
    }
}
