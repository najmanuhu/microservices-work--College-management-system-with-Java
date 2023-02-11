package com.Collage.service.FourthService.controller;


import com.Collage.service.FourthService.entity.Department;
import com.Collage.service.FourthService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){

        log.info("all saved");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public  Department findDepartmentBYId(@PathVariable("id") Long departmentId){


        log.info("all saved");
        return departmentService.findDepartmentBYId(departmentId);
    }

    @GetMapping("/")
    public List<Department> getAllDepartments(Model model){

        return departmentService.getAllDepartments();


//        model.addAttribute("departments", departmentService.getAllDepartments());
//        //return a view
//        return "student";
    }
}
