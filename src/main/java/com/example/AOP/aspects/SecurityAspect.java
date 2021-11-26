package com.example.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {


    @Before("com.example.AOP.aspects.Poincuts.allReturnPointcut()")
    private void beforeGetSecurityAdvice(JoinPoint joinPoint) {
        System.out.println("beforeGetSecurityAdvice: Попытка доступа к изданиям");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Место от куда была попытка входа - " + joinPoint.getSourceLocation().toString() + "\n" +
                "Место куда пытались попасть - " + joinPoint.getTarget().toString());
        System.out.println("------------------------------------------------------------");
    }
}
