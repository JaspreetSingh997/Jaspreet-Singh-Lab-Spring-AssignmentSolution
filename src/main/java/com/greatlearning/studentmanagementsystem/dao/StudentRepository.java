package com.greatlearning.studentmanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmanagementsystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<com.greatlearning.studentmanagementsystem.entity.Student> findAll();

}
