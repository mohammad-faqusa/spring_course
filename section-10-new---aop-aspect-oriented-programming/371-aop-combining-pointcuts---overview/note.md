## 371. AOP: Combining Pointcuts - Overview

### Problem 
* How to apply multiple pointcut expressions to single advice? 
* Execute an advice only if certain conditions are met 
* for example
  * all methods in a package EXCEPT getter/setter methods 

#### Combining Pointcut Expression 
* Combine pointcut expressions using logic operators 
  * AND(&&)
  * OR(||) 
  * NOT(!)
* works like an "if" statement 
* Execution happens only if it evaluates to ture 
```java
@Before("expresionOne() && expressionTwo()")
@Before("expresionOne() || expressionTwo()")
@Before("expresionOne() && !expressionTwo()")
```

#### Example 
* all methods in a package EXCEPT getter/setter methods 

### Development Process 
1. create a pointcut declarations
2. combine pointcut declarations 
3. apply pointcut declaration to advice(s)

#### Step 1. create a pointcut declarations
```java
@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
private void forDaoPackage() {}

@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
private void getter() {}

@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
private void setter() {} 
```

#### Step 2. combine pointcut declarations 

```java
@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
private void forDaoPackage() {}

@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
private void getter() {}

@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
private void setter() {} 

// combine pointcut: include package ... exclude getter/setter 
@Poincut(forDaoPackage() && !(setter() || getter()))
private void forDaoPackageNoGetterSetter() {} 
```

#### Step 3. apply pointcut declaration to advice(s)
```java
// .... 

// combine pointcut: include package ... exclude getter/setter 
@Poincut(forDaoPackage() && !(setter() || getter()))
private void forDaoPackageNoGetterSetter() {} 

@Before("forDaoPackageNoGetterSetter()")
public void beforeAccountAdvice() {
    
}
```