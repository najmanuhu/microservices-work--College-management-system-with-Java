package com.Collage.service.FourthService.service;

import  com.Collage.service.FourthService.entity.Department;
import com.Collage.service.FourthService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){

        log.info("all saved");
        return departmentRepository.save(department);
    }

    public Department findDepartmentBYId(Long departmentId) {

        log.info("all saved");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public List<Department> getAllDepartments() {

            return departmentRepository.findAll();

    }

}

