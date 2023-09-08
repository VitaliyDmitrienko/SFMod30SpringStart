package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationBeanExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example"); //Указываем, где искать наши бины
        context.refresh();  //Обновляем контекст, чтобы наши бины были созданы

        ApplicationBeanExample bean = context.getBean(ApplicationBeanExample.class);
        bean.run();

        context.close();
    }

    public void run() {
        System.out.println("Привет! Я бин, созданный через аннотации");
    }
}