package com.why.mapper;

import com.why.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into t_student(id,name,sex,birth) values(#{id},#{name},#{sex},#{birth})")
    int add(Student student);

    @Update("update t_student set name=#{name},sex=#{sex} where id=#{id}")
    int update(Student student);

    @Delete("delete from t_student where id=#{id}")
    int deleteById(String id);

    @Select("select * from t_student where id=#{id}")
    @Results(id = "student", value = {
            @Result(property = "id", column = "id", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class),
            @Result(property = "birth", column = "birth", javaType = String.class)
    })
    Student queryStudentById(String id);
}
