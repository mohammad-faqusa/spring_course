## 367. AOP - Pointcut Expressions - Coding - Match Any Method in a Package

### Match methods in a Package 
1. move to aspect logging 
2. modify and give the package name 
```java
    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
3. in `AccountDAO` add new method `doWord`
4. in `MembershipDAO` add new method `goToSleep()` 
5. move to main application and call the methods
6. run the application 

