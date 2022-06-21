package com.example.storage.repository;

import com.example.storage.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository <Student, Long> {
}
