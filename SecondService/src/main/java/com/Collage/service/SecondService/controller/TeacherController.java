package com.Collage.service.SecondService.controller;

import com.Collage.service.SecondService.VO.ResponseTemplateVO;
import com.Collage.service.SecondService.entity.Teacher;
import com.Collage.service.SecondService.repository.TeacherRepository;
import com.Collage.service.SecondService.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@Slf4j
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherService teacherService;


    @PostMapping("/")
    public Teacher saveTeacher(@RequestBody Teacher teacher){

        log.info("all saved");
        return teacherService.saveTeacher(teacher);
    }

//    @GetMapping("/{id}")
//    public  Teacher findTeacherBYId(@PathVariable("id") Long teacherId){
//
//        log.info("all saved");
//        return teacherService.findTeacherById(teacherId);
//    }


    @GetMapping("/")
    public List<Teacher> getAllTeachers(){

        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getDepartmentById(@PathVariable("id") String teacherId){

        return teacherService.getDepartmentById(Long.parseLong(teacherId));
    }

//    @GetMapping("/course/{id}")
//    public ResponseTemplateVO getCourseById(@PathVariable("course/{id}") Long teacherId){
//
//        return teacherService.getCourseById(teacherId);
//    }
}
