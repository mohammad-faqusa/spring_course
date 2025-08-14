## 361. AOP - Pointcut Expressions - Coding - Match any add* Method

### Match method starting with "add" in any class 
```java
@Before("execution(public void add*())")
```
1. go to `demoLoggingAspect`
2. change the pointcut expression 
```java
    @Before("execution(public void add*())")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
3. lets change method name in `MembershipDAO` from `addAccount` to `addSilly` 
4. change the method call in main application to apply 
5. run the application 
6. 