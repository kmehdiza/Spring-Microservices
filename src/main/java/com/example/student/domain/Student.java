package com.example.student.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
}
