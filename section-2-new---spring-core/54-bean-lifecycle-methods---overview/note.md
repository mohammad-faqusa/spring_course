## 54. Bean Lifecycle Methods - Overview

### Bean Lifecycle
1. Container started
2. Bean initialized 
3. Dependencies injected
4. Internal Spring Processing 
5. Your Custom Init Method
6. Bean Is Ready For use 
7. Container is shutdown
8. Your Custom Destroy Method
9. Stop

### Bean Lifecycle Methods / Hooks
* You can add custom code during **bean initialization**
  * Calling custom business logic methods 
  * Setting up handles to resources(db, sockets, file etc.)
* You can add custom code during bean destruction 
  * Calling custom business logic 
  * Clean up handles to resources (db, socket, files, etc)

### Init: method configuration
* by using annotation `@PostConstruct`
```java
@Component
public class CricketCoach implements Coach {
    
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }
}
```

### Destroy: method configuration
* by using annotation `@PreDestroy`
```java
@Component
public class CricketCoach implements Coach {
    
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff() {
      System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }
}
```

### Development Process 
1. Define your methods for init and destroy 
2. Add annotations: @PostConstruct and @PreDestroy