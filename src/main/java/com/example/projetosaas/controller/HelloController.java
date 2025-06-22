package com.example.projetosaas.controller;

import com.example.projetosaas.data.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @PostMapping("/helloworld")
    public MessageResponse helloworld() {
        return new MessageResponse("Hello World");
    }
}
