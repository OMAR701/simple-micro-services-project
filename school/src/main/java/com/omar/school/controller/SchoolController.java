package com.omar.school.controller;


import com.omar.school.enteties.School;
import com.omar.school.service.SchoolService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private  final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
            ){
        schoolService.saveStudent(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools(){
        return  ResponseEntity.ok(schoolService.findAllSchools());
    }
}
