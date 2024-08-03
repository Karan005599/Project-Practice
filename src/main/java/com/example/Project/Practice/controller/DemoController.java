package com.example.Project.Practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.Practice.Service.DemoService;
import com.example.Project.Practice.entity.Demo;

@RestController
public class DemoController {
    
    private DemoService demoService;

    public DemoController( DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/user")
    public List<Demo> getAllUser() {
        return this.demoService.getUser();
    }
}
