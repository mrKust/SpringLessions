package com.example.IoC_and_DI.DI;
import com.example.IoC_and_DI.beans_and_container.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("myDog") Pet pet) {
        this.pet = pet;
    }

    public Person() {

    }

    @PostConstruct
    public void init() {
        System.out.println("Create Person");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Delete Person");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public void setPet(Pet pet) {
        this.pet = pet;
    }*/

    public void callPet() {
        System.out.println("Pet c'mon!");
        pet.voice();
    }
}
