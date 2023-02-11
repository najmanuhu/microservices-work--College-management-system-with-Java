package com.Collage.service.SecondService.repository;

import com.Collage.service.SecondService.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByTeacherId(Long teacherId);

}
