package com.haishili.spring6.homework;

import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {
    public void saveStudent() {
        System.out.println("Student save success");
    }
    public void updateStudent() {
        System.out.println("Student update success");
    }
    public void deleteStudent() {
        System.out.println("Student delete success");
    }
    public void getStudent() {
        System.out.println("Student get success");
    }
}
