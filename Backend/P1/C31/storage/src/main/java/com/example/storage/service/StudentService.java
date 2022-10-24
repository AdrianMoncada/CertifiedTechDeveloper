package com.example.storage.service;

import com.example.storage.repository.IStudentRepository;

public class StudentService {
    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
