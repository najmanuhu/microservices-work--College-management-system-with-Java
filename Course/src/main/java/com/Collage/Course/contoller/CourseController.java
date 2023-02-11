package com.Collage.Course.contoller;

import com.Collage.Course.entity.Course;
import com.Collage.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/")
    public Course saveCourses(@RequestBody Course course){

        return courseService.saveCourses(course);
    }

    @GetMapping("/{id}")
    public Optional<Course> getTheId(@PathVariable("id") Long id){
        return courseService.getTheId(id);
    }


}
