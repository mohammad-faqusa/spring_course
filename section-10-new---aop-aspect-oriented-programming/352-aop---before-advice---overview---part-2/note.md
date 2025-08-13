## 352. AOP - @Before Advice - Overview - Part 2

### Spring Boot AOP starter 
* add the dependency for Spring Boot AOP starter 
* since this dependency is part of our pom.xml 
  * Spring boot will automatically enable support for AOP 
  * No need to explicitly use `@EnableAspectJAutoProxy`, we get it for free 

### Development Process = @Before 
1. Create target object: AccountDAO 
2. create main app 
3. create an aspect with `@Before` advice 

#### Step 1. Create target object: AccountDAO 
```java
@Component 
public class AccountDAOImpl implements AccountDAO {
    
    public void addAccount() { 
        System.out.println("DOING MY DB WORK: ADDING AN ACCOUNT");
    }
    
}
```

#### Step 2 : create main app 
```java
private void demoTheBeforeAdvice(AccountDAO theAppDAO){
    
    // call the business method 
    theAccountDAO.addAccount(); 
}
```

#### Step 3. create an aspect with `@Before` advice 
```java
@Aspect
@Component
public class MyDemoLoggingAspect {
    
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("Executing @Before advice on addAccount()");
    }
}
```

#### Best Practices: Aspect and Advices : 
* Keep the code small 
* keep the code fast 
* do not perform any expensive / slow operations 
* Get in and out as QUICKLY as possible