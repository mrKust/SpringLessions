package com.example.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* *Book(..))")
    private void getPointcut() {}

    @Pointcut("execution(* com.example.AOP.UniversityLibrary.get*(..))")
    private void allGetPointcut() {}

    @Pointcut("execution(* com.example.AOP.UniversityLibrary.return*(..)))")
    private void allReturnPointcut() {}

    @Pointcut("allGetPointcut() || allReturnPointcut()")
    private void allGetReturnPointcut() {}

    //@Before("execution(public void getBook())")
    //@Before("execution(public void com.example.AOP.UniversityLibrary.get*())")
    //@Before("execution(* *Book(..))")
    @Before("allGetReturnPointcut()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка взять/вернуть книгу/журнал");
    }
}
