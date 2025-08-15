## 405. AOP: Integrating AOP with Spring MVC CRUD App - Coding - Part 4

### Display arguments to the method 

```java

@Before("forFlowApp()")
public void before(JoinPoint joinPoint){

    String theMethod = joinPoint.getSignature().toShortString();

    myLogger.info("========>> in @Before, calling method: " + theMethod);

    // display the arguments to the method 
    
    // get the arguments 
    Object[] args = joinPoint.getArgs(); 
    
    // loop thru and display args 
    for(Object tempArg : args) {
        myLogger.info("========>> arguments : " + tempArg); 
    }
}
```
2. move to update an employee
   * name , email ... 
3. before saving it, look at the console 
4. save the employee, and recheck the console 