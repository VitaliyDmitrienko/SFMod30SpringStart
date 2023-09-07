package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeveloperInteraction {
    @Autowired(required = false)
    @Qualifier("JavaScriptDeveloper")
    private Developer developer;

    public void runCode() {
        System.out.println(Developer.getCode());
    }
}
