package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    // Around advice to measure and log the execution time of methods in service and repository packages
    @Around("execution(* com.library.service.*.*(..)) || execution(* com.library.repository.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        
        System.out.println("[AOP] >>> Entering: " + joinPoint.getSignature().toShortString());
        
        // Proceed with the actual method execution
        Object result = joinPoint.proceed();
        
        long executionTime = System.currentTimeMillis() - start;
        System.out.println("[AOP] <<< Exiting: " + joinPoint.getSignature().toShortString() + " | Execution Time: " + executionTime + " ms");
        
        return result;
    }
}
