## 380. AOP: Read Method Arguments with JoinPoints - Coding - Part 2

### Step 2: Access and display Method Arguments 

```java
@Before("LuvAopExpressions.forDaoPackageNoGetterSetter()")
public void beforeAddAccount(JoinPoint theJoinPoint) {
    System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");

    // displaying the method signature
    MethodSignature  signature = (MethodSignature) theJoinPoint.getSignature();

    System.out.println("Method Signature: " + signature);

    // displaying the method arguments
    
    // get args 
    Object[] args = theJoinPoint.getArgs(); 
    
    // loop thru args 
    for (Object tempArg : args) {
        System.out.println(tempArg);
        
        if (tempArg instanceof Account) {
            // downcast and print Account specific stuff 
            Account theAccount = (Account) tempArg;
            System.out.println("Account name: " + theAccount.getName());
            System.out.println("Account service: " + theAccount.getService());
        }
    }
}
```
2. run the application, 
   * notice the account arguments 
   * and the Account methods, which are `null` values 
3. move to `demoTheBeforeAdvice`, to set the values of the Account object 
4. 