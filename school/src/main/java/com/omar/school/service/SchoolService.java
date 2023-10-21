package com.omar.school.service;

import com.omar.school.enteties.School;
import com.omar.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public void saveStudent(School school){
        schoolRepository.save(school);
    }
    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }

}
