package com.Collage.service.ThirdService.VO;

import com.Collage.service.ThirdService.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Student student;
    private Course course;
    private Grades grades;
}
