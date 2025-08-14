## 378. AOP: Read Method Arguments with JoinPoints - Overview

### Problem 
* Where we are in an aspect (ie for logging) 
  * How can we access method parameters? 
```java

Account myAccount = new Account(); 
theAccountDAO.addAccount(myAccount, true); 
```

### Development Process 
1. Access and display Method Signature 
2. Access and display Method Arguments 

#### Step 1 : Access and display Method Signature 
```java
@Before("...")
public void beforeADdAccountAdvice(JointPoint theJoinPoint) {
    
    // display the method signature 
    MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature(); 
    
    System.our.println("Method: " + methodSig); 
}
```
* the displayed output : 
  * ![img.png](img.png)

#### Step 2 : Access and display Method Arguments 
```java
@Before("...")
public void beforeADdAccountAdvice(JointPoint theJoinPoint) {
    
    // display method arguments 
    
    // get args 
    Object[] args = theJoinPoint.getArgs();
    
    // loop thru args 
    for (Object tempArg : args) {
        System.out.println(tempArg);
    }
}
```