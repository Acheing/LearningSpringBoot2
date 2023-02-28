package com.example.day2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Environment env;

    @Value("${com.example.test}")
    private String s1;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(env.getProperty("com.example.test"));
        System.out.println(s1);
        return "Hello World!";
    }
}
