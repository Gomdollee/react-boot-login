package com.example.reactbootlogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/data")
    public String test(){
        return "Hello, World!";
    }
}
