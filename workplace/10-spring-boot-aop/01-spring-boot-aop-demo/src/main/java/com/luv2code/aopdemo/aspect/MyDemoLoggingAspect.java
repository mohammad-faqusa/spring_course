package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    @Before("forDaoPackage()")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }

    @Before("forDaoPackage()")
    public void beforeApiAnalytics() {
        System.out.println("====>>> Execution Api Analytics ");
    }
}
