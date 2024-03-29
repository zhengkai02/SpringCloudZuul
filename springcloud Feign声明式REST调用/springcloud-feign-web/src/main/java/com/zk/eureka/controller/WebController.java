package com.zk.eureka.controller;

import com.zk.eureka.IMyFeignClient;
import com.zk.eureka.VO.TestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired private IMyFeignClient myFeignClient;
    @GetMapping("/test")
    public String test(){
        String result=myFeignClient.test(234L);
        System.out.println(result);
        return result;
    }
    @GetMapping("/test2")
    public String test2(){
        TestParam testParam=new TestParam(555,"zhengkai");
        String result=myFeignClient.post(testParam);
        System.out.println(result);
        return result;
    }
}
