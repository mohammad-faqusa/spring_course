## 387. AOP: @AfterReturning Advice - Modify Return Value - Coding

### Post-Process / modify teh data 
1. move to `MyDemoLoggingAspect`
```java

public class MyDemoLoggingAspect {
    public void LogAfterReturningAdvice(JoinPoint joinPoint, List<Account> result) {

        // print the after returning , method signature
        System.out.println("AfterReturning on method : " + joinPoint.getSignature().toShortString());

        // get the accounts
        System.out.println("AfterReturning accounts : " + result);

        // let's post-process the data ... let's modify it :-) 
        
        // convert the account names to uppercase 
        convertAccountNamesToUpperCase(result); 
        
    }
    
    private void convertAccountNamesToUpperCase(List<Account> result) {
        // loop through accounts 
        for(Account tempAccount : result) {
            // get uppercase version of name
            String theUpperName = tempAccount.getName().toUpperCase(); 

            // update the name on the account
            tempAccount.setName(theUpperName); 
        }
    }
}
```
2. move to the main method, check the code, and run the application 
