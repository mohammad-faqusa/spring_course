## 369. AOP: Pointcut Declarations - Coding - Part 1

### Development Process 
1. Create a pointcut declaration 
2. Apply pointcut declaration to advice(s) 

#### Step 1. Create a pointcut declaration 
1. housekeeping the project, copy and paste with name `02-spring-boot-aop-demo-pointcut-declarations`
2. go to demo logging aspect 
```java

@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
private void forDaoPackage() {}
```

#### Step 2. Apply pointcut declaration to advice(s) 
```java
@Before("forDaoPackage()")
public void beforeAddAccountAdvice() {
    System.out.println("\n========>>>>> Executing @Before advice on method");
}
```

3. run the application 


