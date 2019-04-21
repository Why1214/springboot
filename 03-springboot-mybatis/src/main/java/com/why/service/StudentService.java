package com.why.service;

import com.why.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteById(String id);
    Student queryStudentById(String id);
}
