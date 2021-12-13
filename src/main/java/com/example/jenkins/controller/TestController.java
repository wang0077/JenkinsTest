package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wAnG
 * @Date: 2021/12/13 17:08
 * @Description:
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Hello Jenkins";
    }

}
