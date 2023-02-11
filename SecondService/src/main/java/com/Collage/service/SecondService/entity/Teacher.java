package com.Collage.service.SecondService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column
    private String courseId;
    @Column
    private String departmentName;
}
