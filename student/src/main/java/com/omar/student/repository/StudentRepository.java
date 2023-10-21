package com.omar.student.repository;

import com.omar.student.enteties.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student,Integer
        > {
    List<Student> findAllBySchoolId(Integer schoolId);
}
