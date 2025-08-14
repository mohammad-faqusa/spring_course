## 355. AOP - @Before Advice - Coding - Create Aspect
 
### Development Process - @Before
1. Create target object: AccountDAO 
2. Create main app 
3. Create an Aspect with @Before advice 


#### Step 3 : Create an Aspect with @Before advice 
1. create new package `aspect`
2. create class `MyDemoLoggingAspect`
```java

@Aspect 
@Component 
public class MyDemoLoggingAspect {
    
    // this is where we add all of our related advices for logging 
    
    // let's start with at @Before advice 
    
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {

        System.out.println("\n====>>> Executing @Before advice on addAccount");
    }
}
```