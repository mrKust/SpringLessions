package com.example.IoC_and_DI.beans_and_container;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myDog")
@Scope("prototype")
public class Dog implements Pet {
    @Override
    public void voice() {
        System.out.println("Hav-hav");
    }

    @PostConstruct
    public void init() {
        System.out.println("Create Dog");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Delete Dog");
    }
}
