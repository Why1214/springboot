package com.why.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 定义该类一个组件，程序启动时创建一个对象
@Component
public class Animal {

    @Value("${smart.animal.name}")
    private String name;

    @Value("${smart.animal.sex}")
    private String sex;

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

}
