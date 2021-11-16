package com.example.IoC_and_DI.beans_and_container;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Pet {
    @Override
    public void voice() {
        System.out.println("Hav-hav");
    }
}
