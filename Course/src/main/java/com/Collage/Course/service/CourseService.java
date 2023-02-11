package com.Collage.Course.service;

import com.Collage.Course.entity.Course;
import com.Collage.Course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourses(Course course) {

        return courseRepository.save(course);
    }


    public Optional<Course> getTheId(Long id) {

        return courseRepository.findById(id);
    }
}
