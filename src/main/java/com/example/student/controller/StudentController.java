package com.example.student.controller;

import com.example.student.config.AppConfig;
import com.example.student.domain.Student;
import com.example.student.service.StudentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
@RequiredArgsConstructor
public class StudentController {

    private final AppConfig appConfig;

    private final StudentInfoService studentInfoService;

    @GetMapping("/details")
    public String getAppName() {
        return appConfig.getName() + " Version:" + appConfig.getVersion();
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentInfoService.createStudent(student);
    }
}
