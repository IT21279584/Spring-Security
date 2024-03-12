package com.example.springsecuritydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }


    @GetMapping("/admin")
    public String admin(){
        return "This is Admin Page";
    }

    @GetMapping("/")
    public String regular(){
        return "This is Regular Page";
    }
}
