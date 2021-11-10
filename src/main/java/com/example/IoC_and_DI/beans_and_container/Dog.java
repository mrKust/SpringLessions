package com.example.IoC_and_DI.beans_and_container;

public class Dog implements Pet {
    @Override
    public void voice() {
        System.out.println("Hav-hav");
    }
}
