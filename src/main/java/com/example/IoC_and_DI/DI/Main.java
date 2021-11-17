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
        Person person = context.getBean("person", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        Dog mydog = context.getBean("myDog", Dog.class);
        Dog yourDog = context.getBean("myDog", Dog.class);
        System.out.println("Same dogs? " + (mydog==yourDog));
        System.out.println(mydog.toString());
        System.out.println(yourDog.toString());

        Cat myCat = context.getBean("myCat", Cat.class);
//        Dog dog = context.getBean("myDog", Dog.class);
//        Cat cat = context.getBean("myCat", Cat.class);

        //dog.voice();
        //cat.voice();
        context.close();

    }
}
