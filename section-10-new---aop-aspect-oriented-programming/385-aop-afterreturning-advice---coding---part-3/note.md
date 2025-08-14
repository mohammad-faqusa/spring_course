## 385. AOP: @AfterReturning Advice - Coding - Part 3

#### Step 4: Add @AfterReturning advice 
1. move to `meDemoLogginAspect`
2. add the after returning advice 
```java

public class MyDemoLoggingAspect {
    
    @AfterReturning(
            pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning="result"
    )
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
        
        // print out which method we are advising on 
        String method = theJoinPoint.getSignature().toShortString(); 
        System.out.println("\n=====>>>> Executing @AfterReturning on method : " + method); 
        
        // print out the results of the method call 
        System.out.println("\n====>>> result is : " + result);
    }
}
```
3. save and run the application 
4. 