package com.example.springbootcicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome  Hello Controller from spring boot";

    }
}
