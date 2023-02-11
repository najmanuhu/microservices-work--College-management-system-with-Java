package com.Collage.service.ThirdService.repository;

import com.Collage.service.ThirdService.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student getByStudentId(Long studentId);

    Student findByStudentId(Long studentId);
}
