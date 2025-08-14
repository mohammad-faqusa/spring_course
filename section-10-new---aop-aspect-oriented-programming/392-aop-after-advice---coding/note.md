## 392. AOP: @After Advice - Coding

### Development Process - @After 
1. Add @After advice 
2. Test for failure / exception 
3. Test for success case 

#### Step 1. Add @After advice 
1. move to the main application 
2. comment out the previous code in `runner`
3. add method
```java
private demoTheAfterAdvice(AccountDAO theAccountDAO){
    
    // copy the code from the after throw advice 
    
}
```
4. move to demo aspect 
```java
@After() // copy the expression from the previous code 
public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoints) {
    
    // copy and paste from the previous method, refine for (finally)
}
```

#### Step 2. Test for failure / exception 
1. run the application on failure 
2. run the application on success 


