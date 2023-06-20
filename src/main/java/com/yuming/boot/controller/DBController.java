package com.yuming.boot.controller;

import com.yuming.boot.config.DBConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DBController {

    @Autowired
    DBConfig dbConfig;


    @RequestMapping("/getdb")
    public DBConfig getDB() {
           log.info("lombok import a log method");
           return dbConfig;

    }
}
