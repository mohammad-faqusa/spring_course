package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

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
