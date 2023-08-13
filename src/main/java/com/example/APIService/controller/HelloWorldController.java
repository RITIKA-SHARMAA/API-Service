package com.example.APIService.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello(){
        return "Hello! Ritika!";
    }
    @PostMapping("/")
    public String home(){
        return "Hello! Ritika! from Home";
    }


}
