package com.haishili;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findStudentByName(String name);


}
