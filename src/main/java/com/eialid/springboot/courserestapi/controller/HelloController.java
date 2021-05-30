package com.eialid.springboot.courserestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hiMethod(){
        return "Hi from eialid's controller, okay dude";
    }
}
