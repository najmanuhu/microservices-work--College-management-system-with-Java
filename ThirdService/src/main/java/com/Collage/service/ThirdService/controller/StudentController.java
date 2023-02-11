package com.Collage.service.ThirdService.controller;

import com.Collage.service.ThirdService.VO.ResponseTemplateVO;
import com.Collage.service.ThirdService.entity.Student;
import com.Collage.service.ThirdService.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){

        log.info("all saved");
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentById(@PathVariable("id") String studentId){

        return studentService.getStudentById(Long.parseLong(studentId));
    }

    @GetMapping("/")
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }
//    @GetMapping("/{courseid}/")
//    public ResponseTemplateVO getCourseById(@PathVariable("courseid") Long studentId){
//
//        return studentService.getCourseById(studentId);
//    }

}
