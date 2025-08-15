## 395. AOP: @Around Advice - Coding - Part 2

### Step 2 : update main app to call TrafficFortuneService
1. go to main method 
2. inject `TrafficFortuneService`
```java
public CommandLineRunner commandLineRunner(TrafficFortuneService theTrafficFortuneService) {
    
    runner -> {
        
        demoTheAroundAdvice(theTrafficFortuneService);
    }
}

private void demoTheAroundAdvice(TrafficFortuneService theTrafficFortuneService) {

    System.out.println("\nMain Program: demoTheAroundAdvice");

    System.out.println("Calling getFortune()");
    
    String data = theTrafficFortuneService.getFortune();

    System.out.println("\nMy fortune is: " + data);

    System.out.println("Finished");
}
```
3. run the application 

### Step 3: add the advice 
1. open the logging file `myDemoLoggingAspect`
```java
public class MyDemoLoggingAspect {
    
    @Around() // copy from previous, and match for getFortune() method 
    public Object aroundGetFortune (
            ProceedingJoinPoint theProceedingJoinPoint
    ) throws Throwable {
        
        // print out method we are advising on 
        
        // get begin timestamp 
        
        // now. let's execute the method 
        
        // get end timestamp 
        
        // compute duration and display it 
        
        return null; 
    }
}
```