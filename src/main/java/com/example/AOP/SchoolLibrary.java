package com.example.AOP;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library {

    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу в школьной библиотеке");
    }
}
