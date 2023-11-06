package com.taskmanagementapp.taskservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
public class Test {
    @GetMapping("/health")
    public String health(){
        return "I'm healthy !!!";
    }

}
