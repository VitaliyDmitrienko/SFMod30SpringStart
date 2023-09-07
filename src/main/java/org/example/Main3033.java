package org.example;

import org.example.entity.DeveloperInteraction;
import org.example.entity.HelloWorldPrototype;
import org.example.entity.HelloWorldSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3033 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        HelloWorldSingleton helloWorldSingleton = context.getBean(HelloWorldSingleton.class);
        helloWorldSingleton.setMessage("Singleton");
        System.out.println(helloWorldSingleton.getMessage());

        HelloWorldPrototype helloWorldPrototype = context.getBean(HelloWorldPrototype.class);
        helloWorldPrototype.setMessage("Prototype");
        System.out.println(helloWorldPrototype.getMessage());

        helloWorldPrototype = context.getBean(HelloWorldPrototype.class);
        System.out.println(helloWorldPrototype.getMessage());

        context.getBean(HelloWorldSingleton.class);
        System.out.println(helloWorldSingleton.getMessage());
    }
}
