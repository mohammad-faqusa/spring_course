## 379. AOP: Read Method Arguments with JoinPoints - Coding - Part 1

### The process 
1. move to `myDemoLoggingAspect`
```java
@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Before("LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccount(JoinPoint theJoinPoint) {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
        
        // display the method signature 
        MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
        System.out.println("Method: " + methodSig);
        
        // display method arguments 
        
    }

}

```
2. run the application and see the output method signature name 

