package com.example.student.service;

import com.example.student.domain.Student;
import com.example.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentInfoService {
    private final StudentRepository studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }
}
