package org.example;

import org.example.config.CookieConfig;
import org.example.service.WebService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
    public class Application {

        public static void main(String[] args) {

            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CookieConfig.class);
            WebService WebService = context.getBean("webService", WebService.class);
            WebService.getAllUsers();
            WebService.saveUser(new com.example.task315.model.User(3L, "Name1", "LastName1", (byte) 40));
            WebService.updateUser(new com.example.task315.model.User(3L, "Name2", "LastName2", (byte) 50));
            WebService.deleteUser(3L);

            System.out.println(WebService.result);

        }

    }
