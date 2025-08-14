## 358. AOP - Pointcut Expressions - Coding - Match any addAccount Method - Part 1

### Match method names : "addAccount" in any class 
1. go to logging aspect 
```java
@Before("execution(public void addAccount())")
public void beforeAddAccount() {
    System.out.println("\n====>>> Execution BEFORE ADD ACCOUNT ");
}
```
2. let's break, lets change the pointcut expression 
```java
@Before("execution(public void updateAccount())")
public void beforeAddAccount() {
    System.out.println("\n====>>> Execution BEFORE ON METHOD UPDATEACCOUNT ");
}
```
3. there is no match to any method, so don't call it 
4. lets fix it back 
```java
@Before("execution(public void addAccount())")
public void beforeAddAccount() {
    System.out.println("\n====>>> Execution BEFORE ADD ACCOUNT ");
}
```