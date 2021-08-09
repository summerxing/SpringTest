package com.example.chapter012.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 * @date 2021/8/6
 */
@RestController
public class helloControll {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
