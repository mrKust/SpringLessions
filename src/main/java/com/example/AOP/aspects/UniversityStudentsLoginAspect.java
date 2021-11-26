package com.example.AOP.aspects;

import com.example.AOP.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityStudentsLoginAspect {

    @Before("com.example.AOP.aspects.Poincuts.allGetUniversity()")
    public void beforeLoginAspect() {
        System.out.println("beforeLoginAspect : Попытка обращения к данным о студентах");
    }

    @AfterReturning(pointcut = "com.example.AOP.aspects.Poincuts.allGetUniversity()",
    returning = "students")
    public void beforeReturningLoginAspect(JoinPoint joinPoint, List<Student> students) {
        System.out.println("Итоговая информация\n" + "Кол-во студентов - " + students.size());
        System.out.println("beforeReturningLoginAspect: Выдана информация пользователю - " + joinPoint.getSignature().toString());

    }

    @AfterThrowing(pointcut = "com.example.AOP.aspects.Poincuts.allGetUniversity()",
            throwing = "exception")
    public void beforeThrowingLoginAspect(JoinPoint joinPoint, Throwable exception) {
        System.out.println("beforeThrowingLoginAspect: Была выявлена следующая ошибка - " + exception +
                "\nместо появления ошибки " + joinPoint.getSourceLocation());

    }

    @After("com.example.AOP.aspects.Poincuts.allGetUniversity()")
    public void afterLoginAspect(JoinPoint joinPoint) {
        System.out.println("afterLoginAspect: законченно выполнение метода " + joinPoint.getSignature());

    }
}
