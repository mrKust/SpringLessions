package com.example.IoC_and_DI.DI;

import com.example.IoC_and_DI.beans_and_container.Cat;
import com.example.IoC_and_DI.beans_and_container.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context =
        //        new ClassPathXmlApplicationContext("DIwithConstructorContext.xml");

//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("DIwithSetterContext.xml");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationContext.xml");
//        Person person = context.getBean("Person1", Person.class);
//        person.callPet();
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());
        Dog dog = context.getBean("myDog", Dog.class);
        Cat cat = context.getBean("myCat", Cat.class);

        dog.voice();
        cat.voice();
        context.close();

    }
}
