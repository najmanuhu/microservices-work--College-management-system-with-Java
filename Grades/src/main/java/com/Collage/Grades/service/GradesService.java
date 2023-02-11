package com.Collage.Grades.service;

import com.Collage.Grades.entity.Grades;
import com.Collage.Grades.repository.GradesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GradesService {

    @Autowired
    private GradesRepository gradesRepository;

    public Grades saveStudentGrades(Grades grades) {

        return gradesRepository.save(grades);
    }

    public Optional<Grades> getTheId(Long id) {

        return gradesRepository.findById(id);
    }
}
