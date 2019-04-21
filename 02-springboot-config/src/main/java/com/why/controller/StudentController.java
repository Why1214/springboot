package com.why.controller;

import com.why.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private Student student;

    @RequestMapping("/student")
    public String findStudent() {
        return "name:" + student.getName() + "; num:" + student.getNum() + "; sex:" + student.getSex();
    }
}
