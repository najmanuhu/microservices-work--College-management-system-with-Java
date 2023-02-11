package com.Collage.service.ThirdService.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    private Long id;


    private String courseName;

    private String teacherName;

    private String departmentName;
}
