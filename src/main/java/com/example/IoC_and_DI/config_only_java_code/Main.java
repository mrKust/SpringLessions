package com.example.IoC_and_DI.config_only_java_code;

import com.example.IoC_and_DI.DI.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("person", Person.class);
        person.callPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
