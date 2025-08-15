## 394. AOP: @Around Advice - Coding - Part 1

### Development process 
1. Create TrafficFortuneService 
2. update main app to call TrafficFortuneService
3. Add @Around advice 

#### Step 1 : Create TrafficFortuneService 
1. create new package `service`
2. create new interface `TrafficFortuneService`
```java

public interface TrafficFortuneService{
    
    String getFortune(); 
}

```
3. create new class `TrafficFortuneServiceImpl` 
```java
@Service
public class TrafficFortuneServiceImpl implements TrafficFortuneService {
    
    @Override 
    public String getFortune() {
        
        // simulate a delay 
        try{
            TimeUnit.SECONDS.sleep(5); // pause the application for 5 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e); 
        }
        
        // return a fortune 
        return "Except heavy traffic this morning";
    }
}
```