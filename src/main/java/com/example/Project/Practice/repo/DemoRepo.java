package com.example.Project.Practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.Practice.entity.Demo;

public interface DemoRepo extends JpaRepository<Demo, Integer>{
    
}
