## 399. @Around Advice - Handle Exception - Coding - Part 2

#### Step 2 : Modify @Around  advice to handle exception 
1. move to `demoLoggingAspect`
2. move to the code around advice 
```java

@Around("execution(* com.luv2code.aopdemo.services.TrafficFortuneService.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint pjp) throws Throwable {

        // time begin
        long begin = System.currentTimeMillis();

        // executing the function
        Object result =  null;
        
        try{
            result = pjp.proceed();
        } catch (Exception exc) {
            // log the exception 
            System.out.println(exc.getMessage());
            
            // give user a custom message 
            result = "Major accident! but no worries, your private AOP helicopter is on the way!";
        }
        

        long end = System.currentTimeMillis();

        long duration = end - begin;

        System.out.println("Measured method ("+ pjp.getSignature().toShortString() +")");
        System.out.println("\n========> Duration : " + duration + " milliseconds");

        return result;
    }
```

3. move to main application 
    * the main program call the method that cause the exception 
    * but the main program will never know about that exception 
5. run the applicaiton 
    * you may notice the seconds is 0.0 , 
    * answer : use nanosecods instead of milliseconds 
6. go to demo logging aspect , to modify the code using nano seconds 
`long begin = System.nanoTime()`
7. 