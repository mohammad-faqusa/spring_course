## 403. AOP: Integrating AOP with Spring MVC CRUD App - Coding - Part 2

### The process 
1. create new package `aspect`
2. create new class `DemoLoggingAspect`
```java
@Aspect
@Component
public class DemoLoggingAspect { 
    
    
    // setup logger 
    private Logger myLogger = Logger.getLogger(getClass().getName()); 
    
}
```