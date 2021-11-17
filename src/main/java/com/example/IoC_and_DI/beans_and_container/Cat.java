package com.example.IoC_and_DI.beans_and_container;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCat")
public class Cat implements Pet{

    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Create Cat");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Delete Cat");
    }
}
