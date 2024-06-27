package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
//    List<Student> findByFirstName(String firstName);
//    List<Student> findByFirstNameandLastName(String firstName,String lastName);
    List<Student> findByfirstNameNot(String firstName);
}
