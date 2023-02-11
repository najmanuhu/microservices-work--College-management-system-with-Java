package com.Collage.service.SecondService.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grades {

    private Long id;
    private String courseName;
    private int marks;
    private String grade;
    private String studentName;
}
