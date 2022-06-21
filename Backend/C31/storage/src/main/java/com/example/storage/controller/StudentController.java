package com.example.storage.controller;

import com.example.storage.model.Student;
import com.example.storage.service.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = "application/json")
    public List<Student> getStudent() {
        return studentService.findAllStudents();
    }

    @GetMapping(value = "/student/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    @PostMapping(value = "/student/add")
    public Student addStudent(Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping(value = "/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

    /*@PutMapping(value = "student/update"){
        public String
    }*/

    @PutMapping(value = "student/update")
        public String updateStudent(Student student){
            return studentService.updateStudent(student);
        }

}
