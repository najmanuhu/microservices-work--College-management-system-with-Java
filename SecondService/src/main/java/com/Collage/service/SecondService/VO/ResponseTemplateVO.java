package com.Collage.service.SecondService.VO;

import com.Collage.service.SecondService.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Teacher teacher;
    private Department department;
    private Course course;
    private Grades grades;
}
