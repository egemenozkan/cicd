package com.project.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye bye";
    }
}
