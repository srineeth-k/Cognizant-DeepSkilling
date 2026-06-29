package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    // Before Advice: Logs prior to method execution
    @Before("execution(* com.library.service.BookService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP-BEFORE] >>> Preparing to execute: " + joinPoint.getSignature().toShortString());
    }

    // After Advice: Logs post method execution (runs regardless of outcome)
    @After("execution(* com.library.service.BookService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[AOP-AFTER] <<< Completed execution of: " + joinPoint.getSignature().toShortString());
    }
}
