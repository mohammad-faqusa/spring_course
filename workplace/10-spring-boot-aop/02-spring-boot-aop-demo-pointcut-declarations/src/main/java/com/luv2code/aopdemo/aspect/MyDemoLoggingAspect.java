package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Around("execution(* com.luv2code.aopdemo.services.TrafficFortuneService.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint pjp) throws Throwable {

        // time begin
        long begin = System.nanoTime();

        // executing the function
        Object result = null;

        try{
            result = pjp.proceed();
        } catch (Exception e) {

            // log the exception
            System.out.println("aroundGetFortune exception : " + e);

            // send back to customer
            result = "We have a major accident, but no worries, the delivery is coming!";
        }


        long end = System.nanoTime();

        long duration = end - begin;

        System.out.println("Measured method ("+ pjp.getSignature().toShortString() +")");
        System.out.println("\n========> Duration : " + duration + " nano seconds");

        return result;
    }

    @Around("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
    public Object logAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

        // time begin
        long begin = System.currentTimeMillis();

        // executing the function
        Object result = pjp.proceed();

        long end = System.currentTimeMillis();

        long duration = end - begin;

        System.out.println("Measured method : " + pjp.getSignature().toShortString());
        System.out.println("\n========> Duration : " + duration + " milliseconds");

        return result;
    }

    @After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void logAfterAdvice(JoinPoint joinPoint) {

        System.out.println("After (Finally) on method : " + joinPoint.getSignature().toShortString());

    }


    @AfterThrowing(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "theExc"
    )
    public void logAfterThrowingAdvice(JoinPoint joinPoint, Throwable theExc) {

        System.out.println("After throwing on method : " + joinPoint.getSignature().toShortString());
        System.out.println("\n=====>>>> Exception : " +  theExc.getMessage());

    }

    @AfterReturning(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts())",
            returning = "result"
    )
    public void LogAfterReturningAdvice(JoinPoint joinPoint, List<Account> result) {

        // print the after returning , method signature
        System.out.println("AfterReturning on method : " + joinPoint.getSignature().toShortString());

        // get the accounts
        System.out.println("AfterReturning accounts : " + result);

        // loop through the accounts
        for(Account account:result){
            // convert the name to uppercase
            account.setName(account.getName().toUpperCase());
        }

    }

    @Before("LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccount(JoinPoint theJoinPoint) {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");

        // displaying the method signature
        MethodSignature  signature = (MethodSignature) theJoinPoint.getSignature();

        System.out.println("Method Signature: " + signature);

        // displaying the method arguments

        // get arguments
        Object[] args = theJoinPoint.getArgs();

        for(Object arg : args){
            System.out.println("this is arg of " + arg);

            // specify the account
            if (arg instanceof Account){
                Account account = (Account) arg;
                System.out.println("Account Name : " + account.getName());
                System.out.println("Account Email : " + account.getEmail());
            }
        }




    }

}
