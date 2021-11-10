package com.example.IoC_and_DI.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context =
        //        new ClassPathXmlApplicationContext("DIwithConstructorContext.xml");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DIwithSetterContext.xml");
        Person person = context.getBean("Person1", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();

    }
}
