## 362. AOP - Pointcut Expressions - Coding - Match any Return Type

### Match method with based on return type 
1. go to the aspect file 
2. change the pointcut expression 
```java
    @Before("execution(void add*())")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
3. change the return type of method `addSilly` to `boolean` in `MembershipDAO`
4. run the application and check the results 
5. lets match any return type 
```java
    @Before("execution(* add*())")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
6. it will match the both methods 
7. run the application and check the results 

