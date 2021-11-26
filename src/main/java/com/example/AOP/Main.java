package com.example.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        universityLibrary.getBook();
        universityLibrary.getMagazine(1);

        System.out.println(universityLibrary.returnBook());

        /*universityLibrary.returnMagazine();

        universityLibrary.addBook();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();*/

        /*University university = context.getBean("university", University.class);

        university.addStudents();

        try {
            university.getListOfStudents();

        } catch (Exception e) {
            System.out.println("Выявлена ошибка " + e);
        }*/

        context.close();
    }
}
