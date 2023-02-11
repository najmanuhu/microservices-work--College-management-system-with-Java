package com.Collage.Grades.controller;

import com.Collage.Grades.entity.Grades;
import com.Collage.Grades.service.GradesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student_grade")
@RequiredArgsConstructor
public class GradesController {

    @Autowired
    private GradesService gradesService;

    @PostMapping("/")
    public Grades saveStudentGrades(@RequestBody Grades grades){

        return gradesService.saveStudentGrades(grades);
    }

    @GetMapping("/{id}")
    public Optional<Grades> getTheId(@PathVariable("id") Long id){

        return gradesService.getTheId(id);
    }

}
