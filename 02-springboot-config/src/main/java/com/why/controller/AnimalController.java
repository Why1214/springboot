package com.why.controller;

import com.why.bean.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @Autowired
    private Animal animal;

    @RequestMapping("/animal")
    public String getAnimal() {
        return "animal'name is " + animal.getName() + ", and sex is " + animal.getSex();
    }
}
