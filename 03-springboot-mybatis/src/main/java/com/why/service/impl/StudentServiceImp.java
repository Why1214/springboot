package com.why.service.impl;

import com.why.bean.Student;
import com.why.mapper.StudentMapper;
import com.why.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteById(String id) {
        return this.studentMapper.deleteById(id);
    }

    @Override
    public Student queryStudentById(String id) {
        return this.studentMapper.queryStudentById(id);
    }
}
