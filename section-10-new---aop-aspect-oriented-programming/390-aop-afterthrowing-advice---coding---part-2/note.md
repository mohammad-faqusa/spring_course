## 390. AOP: @AfterThrowing Advice - Coding - Part 2

### Step 3: Add @AfterThrowing advice 
1. move to `MyDemoLoggingAspect`

```java
public class MyDemoLoggingAspect {
    
    @AfterThrowing(
            pointcut = "", // copy the pointcut from previous advice 
            throwing = "theExc"
    )
    public void afterThrowingFindAccountsAdvice(
            JoinPoint theJoinPoint, Throwable theExc
    ) {
        
        // print out which method we are advising on 
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>>> Executing @AfterThrowing on method: " + method);
        
        // log the exception 
        System.out.println("\n=====>>> The exception is : " + theExc);
    }
}
```