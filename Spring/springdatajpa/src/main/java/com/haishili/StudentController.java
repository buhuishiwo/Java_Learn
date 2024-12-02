package com.haishili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/users")
    public List<Student> getStudents() {
        return studentService.findAllStudent();
    }

    @GetMapping("/user/{name}")
    public Student getStudent(@PathVariable String name) {
        return studentService.findStudentByName(name);
    }
}
