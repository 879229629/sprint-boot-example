package com.zenggang;

import com.zenggang.controller.Auth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnesApplication {
    public static void main(String[] args) {
        SpringApplication.run(Auth.class, args);
    }
}
