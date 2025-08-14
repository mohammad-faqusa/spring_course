## 373. AOP: Combining Pointcuts - Coding - Part 2

### The process 
1. go to aspect logging

```java

// creeate a pointcut for getter methods 
@Pointcut("execution(* com.luv2.code.aop.dao.*.get*(..))")
private void getter() {} 

// create a pointcut for setter methods 
@Pointcut("execution(* com.luv2.code.aop.dao.*.set*(..))")
private void setter() {}

// create pointcut: include package ... exclude getter/setter
@Pointcut("forDaoPackage() && !(getter() || setter())")
private void forDAoPackageNoGetterSetter() {} 

@Before("forDAoPackageNoGetterSetter()")
public void beforeAddAccountAdvice() {
    // .... 
}

@Before("forDAoPackageNoGetterSetter()")
public void performApiAnalytics() {
    // .... 
}
```

2. run the application, and check the results ,
   * notice that there is no advice being applied for getters and setters 
* 
