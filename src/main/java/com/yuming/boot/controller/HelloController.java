package com.yuming.boot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuming
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handleHello() {
             return "hello,spring boot";
    }

    @RequestMapping("/word")
    public String handleWord() {
        return "你好";
    }


}
