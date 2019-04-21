package com.why;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 表示该类是一个Controller接口
// 该类必须和启动类 DemoApplication 在同一个包下，或者该包的子包
@RestController
public class DemoController {

    /**
     * 定义一个web接口
     *
     * @return
     */
    @RequestMapping("/")
    public String sayHello() {
        return "welcome to spring boot";
    }
}
