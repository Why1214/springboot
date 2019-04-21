package com.why.bean;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -339516038496531943L;
    private String id;
    private String name;
    private String sex;
    private String birth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
