## 398. @Around Advice - Handle Exception - Coding - Part 1

### development process
1. add trip wire to simulate an exception 
2. Modify @Around advice to handle exception 

#### Step 1 : add trip wire to simulate an exception 
1. open the main application
2. in runner comment out the previous code 
3. add new method `demoTheAroundAdviceHandleException(theTrafficFortuneService)`

```java
private void demoTheAroundAdviceHandleException(TrafficFortuneService theTrafficFortuneService) {

    System.out.println("\nMain Program: demoTheAroundAdviceHandleException ");

    System.out.println("\nCalling getFortune()");

    boolean tripWire = true; 
    String data =  theTrafficFortuneService.getFortune(tripWire);

    System.out.println("\nMy fortune is : " + data);

    System.out.println("Finished");
}
```

4. in `TrafficFortuneService` add new method 
```java
public class TrafficFortuneServiceImpl implements  TrafficFortuneService {
    
    public String getFortune(boolean tripWire) {
        
        if(tripWire){
            throw new RuntimeException("Major accident! Highway is closed")
        }
        
        return getFortune()  ; 
    }
}
```
5. run the application, we have exception `java.lang.RuntimeException`

