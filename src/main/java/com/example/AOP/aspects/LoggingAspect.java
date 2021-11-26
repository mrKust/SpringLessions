package com.example.AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    //@Before("execution(public void getBook())")
    //@Before("execution(public void com.example.AOP.UniversityLibrary.get*())")
    //@Before("execution(* *Book(..))")
    @Before("com.example.AOP.aspects.Poincuts.allReturnPointcut()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка взять/вернуть книгу/журнал");
        System.out.println("------------------------------------------------------------");
    }

    @Around("com.example.AOP.aspects.Poincuts.allReturnPointcut()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long begin = System.currentTimeMillis();
        Object targetMethod = null;
        try {
            targetMethod = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("При выполнении метода " + proceedingJoinPoint.getSignature()
            + " произошла ошибка");
            targetMethod = "Не удалось вернуть книгу";
        }
        long end = System.currentTimeMillis();

        System.out.println("Время выполнения метода = " + (end - begin));

        return targetMethod;
    }
}
