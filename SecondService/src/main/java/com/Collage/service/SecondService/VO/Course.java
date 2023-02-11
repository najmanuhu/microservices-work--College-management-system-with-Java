package com.Collage.service.SecondService.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    private Long id;


    private String courseName;

    private String teacherName;

    private String departmentName;
}
