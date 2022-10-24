package com.example.storage.service;

import com.example.storage.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    public List<Student> findAllStudents();
    public Optional<Student> findStudentById(Long id);

    public Student saveStudent(Student student);

    public String deleteStudent(Long id);

    public String updateStudent(Student student);
}
