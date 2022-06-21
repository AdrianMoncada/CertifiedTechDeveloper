package com.example.storage.service;

import com.example.storage.model.Student;
import com.example.storage.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{
    private final IStudentRepository studentRepository;

    public StudentServiceImpl(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        if(student != null){
            return studentRepository.save(student);
        }
        return new Student();
    }

    @Override
    public String deleteStudent(Long id) {
        if(studentRepository.findById(id).isPresent()){
            String studentName = studentRepository.getReferenceById(id).getName();
            studentRepository.deleteById(id);
            return "Student id: " + id +  " name: " + studentName + " deleted.";
        }
        return "Student with id: " + id + " dont exist.";
    }

    @Override
    public String updateStudent(Student student) {
        Long studentId = student.getId();
        String response = "";
        if(studentRepository.findById(studentId).isPresent()){
            Student studentToUpdate = studentRepository.getReferenceById(studentId);
            studentToUpdate.setDni(student.getDni());
            studentToUpdate.setLastName(student.getLastName());
            studentToUpdate.setName(student.getName());
            studentRepository.save(studentToUpdate);
            response = "Student with id: " + studentId  + " has been modified.";
        } else {
            response = "Student with id: " + studentId + " dont exist.";
        }

        return response;
    }


}
