## 365. AOP - Pointcut Expressions - Coding - Match Method with Account and more Params

### Match method with "Account" Param and more Param types 
1. move to `AccountDAO` and add parameter 
```java
    void addAccount(Account theAccount, boolean vipFlag);
```
2. update the implementation 
3. update the call method in main application 
4. we still haven't modifies the pointcut expression 
5. run the application, and notice **no matches** 
6. update the pointcut expression 
```java
    @Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
7. run the application again 
8. 