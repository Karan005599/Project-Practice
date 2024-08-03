package com.example.Project.Practice.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Project.Practice.entity.Demo;
import com.example.Project.Practice.repo.DemoRepo;

@Service
public class DemoService {

    private DemoRepo demoRepo;

    public DemoService( DemoRepo demoRepo) {
        this.demoRepo = demoRepo;
    }

    public List<Demo> getUser() {
        return  this.demoRepo.findAll();
        
    }


    
}
