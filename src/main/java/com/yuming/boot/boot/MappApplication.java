package com.yuming.boot.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wangyuming
 * scanBasePackages= "com.yuming.boot"
 */
@SpringBootApplication(scanBasePackages = "com.yuming.boot")
public class MappApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MappApplication.class, args);

        int beanCount = run.getBeanDefinitionCount();
        System.out.println(beanCount);

        String[] names = run.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);

        }
        
    }

}
