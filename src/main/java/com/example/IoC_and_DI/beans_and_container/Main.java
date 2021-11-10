package com.example.IoC_and_DI.beans_and_container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet dog = context.getBean("PetDog", Pet.class);
        dog.voice();
        Pet cat = context.getBean("PetCat", Pet.class);
        cat.voice();
        context.close();
    }
}
