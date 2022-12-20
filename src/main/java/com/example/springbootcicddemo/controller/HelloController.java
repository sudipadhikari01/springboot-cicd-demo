package com.example.springbootcicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/welcome")
    public String welcome(){
<<<<<<< Updated upstream
        return "Welcome  Hello Controller";
=======
        return "Welcome to Hello Controller spring boot";
>>>>>>> Stashed changes
    }
}
