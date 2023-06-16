package com.yuming.boot.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangyuming
 */
@SpringBootApplication(scanBasePackages = "com.yuming.boot")
public class MappApplication {
    public static void main(String[] args) {
        SpringApplication.run(MappApplication.class,args);
    }

}
