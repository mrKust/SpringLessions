package com.example.AOP;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends Library {

    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу в университетской библиотеке");
    }

    public void returnBook() {
        System.out.println("Попытка вернуть книгу в университетскую библиотеку");
    }

    public void getMagazine(int i) {
        System.out.println("Попытка взять журнал в университетской библиотеке");
    }

    public void returnMagazine() {
        System.out.println("Попытка вернуть журнал в университетскую библиотеку");
    }

    public void addBook() {
        System.out.println("Попытка добавить книгу в университетскую библиотеку");
    }
}
