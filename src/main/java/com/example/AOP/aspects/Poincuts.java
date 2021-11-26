package com.example.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Poincuts {

    @Pointcut("execution(* *Book(..))")
    public void getPointcut() {}

    @Pointcut("execution(* com.example.AOP.UniversityLibrary.get*(..))")
    public void allGetPointcut() {}

    @Pointcut("execution(* com.example.AOP.UniversityLibrary.return*(..)))")
    public void allReturnPointcut() {}

    @Pointcut("allGetPointcut() || allReturnPointcut()")
    public void allGetReturnPointcut() {}

    @Pointcut("execution(* com.example.AOP.University.get*(..))")
    public void allGetUniversity() {}
}
