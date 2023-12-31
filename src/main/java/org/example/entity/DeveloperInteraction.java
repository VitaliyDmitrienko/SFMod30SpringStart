package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeveloperInteraction {
    @Autowired(required = false)
    @Qualifier("JavaDeveloper")
    private Developer javaDeveloper;
    @Autowired(required = false)
    @Qualifier("JavaScriptDeveloper")
    private Developer jsDeveloper;

    public void runCode() {
        System.out.println(javaDeveloper.getCode());
        System.out.println(jsDeveloper.getCode());
    }
}
