package com.example.AOP;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends Library {

    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу в университетской библиотеке");
        System.out.println("------------------------------------------------------------");
    }

    public String returnBook() {
        int a = 1 / 0;
        System.out.println("Попытка вернуть книгу в университетскую библиотеку");
        return "Успешное возвращение книги";
    }

    public void getMagazine(int i) {
        System.out.println("Попытка взять журнал в университетской библиотеке");
        System.out.println("------------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Попытка вернуть журнал в университетскую библиотеку");
        System.out.println("------------------------------------------------------------");
    }

    public void addBook() {
        System.out.println("Попытка добавить книгу в университетскую библиотеку");
        System.out.println("------------------------------------------------------------");
    }
}
