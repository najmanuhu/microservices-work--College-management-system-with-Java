package com.Collage.service.SecondService.service;

import com.Collage.service.SecondService.VO.Course;
import com.Collage.service.SecondService.VO.Department;
import com.Collage.service.SecondService.VO.Grades;
import com.Collage.service.SecondService.VO.ResponseTemplateVO;
import com.Collage.service.SecondService.entity.Teacher;
import com.Collage.service.SecondService.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Teacher saveTeacher(Teacher teacher) {

        log.info("all saved");
        return teacherRepository.save(teacher);
    }

//        public Teacher findTeacherById(Long teacherId) {
//        log.info("all saved");
//        return teacherRepository.findByTeacherId(teacherId);
//    }


    public List<Teacher> getAllTeachers() {

        List<Teacher> teacher= new ArrayList<Teacher>();
        teacherRepository.findAll().forEach(teacher1 -> teacher.add(teacher1));
        return teacher;
    }

    public ResponseTemplateVO getDepartmentById(Long teacherId) {



        ResponseTemplateVO vo = new ResponseTemplateVO();
        Teacher teacher = teacherRepository.findByTeacherId(teacherId);

        Department department = restTemplate.
                getForObject("http://localhost:9092/departments/1",
                Department.class);

        Course course = restTemplate.getForObject("http://localhost:9099/courses/1",
                Course.class);

        Grades grades = restTemplate.getForObject("http://localhost:5458/student_grade/1",
                Grades.class);

        vo.setTeacher(teacher);
        vo.setDepartment(department);
        vo.setCourse(course);
        vo.setGrades(grades);
//        System.out.println(vo);
        return vo;
    }

}
