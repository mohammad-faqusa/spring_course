## Lazy Initialization 

### Initialization 
* By defualt, when yoru application starts, all beans are in initialized
  * @Component, etc...
* Spring will create an instance of each nad make them available 

### Diagnostics: Add println to constructors 
```java
@Component
public class CricketCaoch implements Coach {
    
    public CricketCaoch(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
}
```

* when we start the application, the output occur on console

### Lazy initialization 
* Instead of creating all beans up front, we can specify lazy initialization
* A bean will only be initialized in the following cases: 
  * It is needed for dependency injection
  * Or it is explicitly requested
* Add the `@Lazy` annotation to a given class
* Advantages 
  * Only create objects as needed
  * May help with faster startup time if you have large number of components 
* Disadvantages
  * if you have web related web related components like `@RestController`, not created until requested
  * May not discover configuration issues until too late
  * Need to make sure you have enough memory for all beans once created
* Lazy initialization feature 
  * is disabled by defualt 
  * you should **profile** your application  
  before configuring **lazy initialization** 
  Avoid the common pitfall or premature optimization 

#### Lazy Initialization with @Lazy
```java
@Component
@Lazy
public class CricketCaoch implements Coach {
    
    public CricketCaoch(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
}
```
* in Rest Controller, inject the `cricketCoach` with **Qualifier**
* To configure other beans for **lazy initialization**
  * We would need to add @Lazy to each class
* Turns into tedious work for a large number of classes 
* I wish we could set a global configuration property

#### Lazy Initialization - Global configuration
_File: application.properties_
```python
spring.main.lazy-initialzation=true
```
* All beans are lazy...  
no beans are created until needed  
Including our `DemoController`
* Once we access REST endpoint `/dailywork`  
Spring will determine dependencies for `DemoController`
* For dependency resolution  
Spring creates instance of `CricketCoach` first ...  
Then creates instance of `DemoController`  
and injects the `CricketCoach`


