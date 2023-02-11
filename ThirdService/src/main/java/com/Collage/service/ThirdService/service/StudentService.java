package com.Collage.service.ThirdService.service;

import com.Collage.service.ThirdService.VO.Course;
import com.Collage.service.ThirdService.VO.ResponseTemplateVO;
import com.Collage.service.ThirdService.entity.Student;
import com.Collage.service.ThirdService.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;
    public Student saveStudent(Student student) {

        log.info("all saved");
        return studentRepository.save(student);
    }

    public Student getStudentById(Long studentId) {

        ResponseTemplateVO vo1 = new ResponseTemplateVO();
        Student student = studentRepository.findByStudentId(studentId);
        return student;
    }

    public List<Student> getAllStudents() {

        List<Student> student = new ArrayList<Student>();
        studentRepository.findAll().forEach(student1 -> student.add(student1));
        return student;
    }

    public ResponseTemplateVO getCourseById(Long studentId) {

        ResponseTemplateVO vo1 = new ResponseTemplateVO();
        Student student = studentRepository.findByStudentId(studentId);

        Course course = restTemplate.getForObject("http://localhost:9099/courses/" + student.getCourseId(),
                Course.class);

        vo1.setStudent(student);
        vo1.setCourse(course);

        return vo1;
    }
}
