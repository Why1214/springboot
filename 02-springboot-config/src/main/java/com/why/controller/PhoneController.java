package com.why.controller;

import com.why.bean.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    @Autowired
    private Phone phone;

    @RequestMapping("/phone")
    public String findPhone() {
        return "name:" + phone.getName() + "----producer:" + phone.getProducer();
    }
}