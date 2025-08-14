package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @AfterReturning(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts())",
            returning = "result"
    )
    public void LogAfterReturningAdvice(JoinPoint joinPoint, List<Account> result) {

        // print the after returning , method signature
        System.out.println("AfterReturning on method : " + joinPoint.getSignature().toShortString());

        // get the accounts
        System.out.println("AfterReturning accounts : " + result);

        if(!result.isEmpty()) {
            Account tempAccount =  result.get(0);
            tempAccount.setName("Daffy duff");
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
