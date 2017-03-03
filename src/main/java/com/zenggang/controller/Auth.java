package com.zenggang.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Auth {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World..";
    }
}
