package com.haishili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student findStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

}
