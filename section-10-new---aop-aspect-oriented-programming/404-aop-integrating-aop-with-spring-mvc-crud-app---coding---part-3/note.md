## 404. AOP: Integrating AOP with Spring MVC CRUD App - Coding - Part 3

### The process
1. in the aspect 

```java
@Aspect
@Component
public class DemoLoggingAspect {


    // setup logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    // copy the package name
    @Pointcut("execution(* com....controller.*.*(..))")
    private void forControllerPackage() {}
    
    // so same for service package 
    @Pointcut("execution(* com....service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com....dao.*.*(..))")
    private void forDaoPackage() {}
    
    // combine pointcuts 
    @Pointcut("forControllerPackage() || forServicePackage()  || forDaoPackage()")
    private void forAppFlow() {}
    
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint) {
        
        // display method we are calling 
        String theMethod = theJoinPoint.getSignature().toShortString(); 
        myLogger.info("========>> in @Before: calling method: " + theMethod);
        
        // display the arguments to the method 
    }
}
```
2. lets quick test 
3. go to localhost:8080 , and check the console 
