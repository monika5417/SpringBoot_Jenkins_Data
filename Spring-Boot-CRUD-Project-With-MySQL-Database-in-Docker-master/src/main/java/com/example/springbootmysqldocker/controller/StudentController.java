package com.example.springbootmysqldocker.controller;

import com.example.springbootmysqldocker.entity.Student;
import com.example.springbootmysqldocker.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/findAll")
   public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    @PostMapping("/insert")
    public Student insert(@RequestBody Student student){
        return studentRepo.save(student);
    }
    
    @GetMapping
    public String message() {
    	return "Hiii From Spring Boot Mysql Jenkins test data";
    }
    
    @GetMapping("/message1")
    public String message1() {
    	return "Hiii abhi hamne puranan message change kr diya hai";
    }
}
