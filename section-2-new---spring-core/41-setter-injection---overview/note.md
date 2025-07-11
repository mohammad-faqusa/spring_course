## Setter Injection 


### Spring Injection Types: 
* Constructor Injection 
* Setter Injection  
  inject dependencies by calling setter method(s) on your class


### Autowiring example : 
* Inject a `Coach` implementation
* Spring will scan for @Components
* Any one implements the Coach interface???
* If so, let's inject them. for exmaple: `CricketCoach`

### Development Process - Setter Injection 
1. Create setter method(s) in your class for injections 
2. Cnfigure the dependency injeciton with **@Autowired** annotaion 

#### Step 1: Create setter method(s) in your class for injections
_File: DemoController.java_
```java
@RestController
public class DemoController {
    private Coach myCoach;
    
    public void setCoach(Coach theCoach) {
        myCouch = theCoach; 
    }
}
```

#### Step 2: Configure the dependency injection with Autowired Annoation
_File: DemoController.java_
```java
@RestController
public class DemoController {
    private Coach myCoach;
    
    @Autowired
    public void setCoach(Coach theCoach) {
        myCouch = theCoach; 
    }
}
```

### **note** The Spring Framework will perfomr operaitons behind the scenes for you 

### How Spring process you applicaiton
_File: Coach.java_
```java
public interface Coach{
    public getDailyWork() ; 
}
```

_File: CricketCoach.java_
```java
@Component
public class CricketCoach{
    
    @Override
    public getDailyWork() {
        return "Practice fast bowling for 15 minutes"; 
    }
}
```
_File: DemoController.java_
```java
@RestController
public class DemoController {
    private Coach myCoach;
    
    @Autowired
    public void setCoach(Coach theCoach) {
        myCouch = theCoach; 
    }
}
```

#### Spring Framework 
```java
Caoch theCoach = new CricketCoach(); 
DemoController demoController = new DemoController(); 
demoController.setCoach(theCoach); 

```

### Inject dependencies by claling Any method on yoru class
simply give : **@Autowired**


### Injection Types - Which one to use ?
#### Contructor Injection : 
* Use this when you have required dependencies
* Generatlly recommended by the spring.io development team as first choice

#### Setter Injection 
* use when you have optional dependencies
* if dependency is not provided, your app can provide reasonable defualt logic




