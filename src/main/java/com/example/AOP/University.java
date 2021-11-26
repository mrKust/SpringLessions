package com.example.AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Volodya Genie", 2, 3.5);
        Student st2 = new Student("Vitalii Volochay", 4, 4.15);
        Student st3 = new Student("Roman Fominok", 1, 4.75);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getListOfStudents() {

        students.get(3);
        System.out.println(students.toString());
        return students;
    }
}
