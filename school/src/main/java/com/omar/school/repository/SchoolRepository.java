package com.omar.school.repository;

import com.omar.school.enteties.School;
import com.omar.student.enteties.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository  extends JpaRepository<School,Integer
        > {
}
