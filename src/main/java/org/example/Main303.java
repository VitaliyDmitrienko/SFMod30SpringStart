package org.example;

import org.example.entity.DeveloperInteraction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main303 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        DeveloperInteraction developerInteraction = context.getBean(DeveloperInteraction.class);
        developerInteraction.runCode();
    }
}
