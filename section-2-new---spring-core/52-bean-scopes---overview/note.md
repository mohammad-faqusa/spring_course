## 52. Bean Scopes - Overview

### Bean Scopes 
* Scope referees to the lifecycle of a bean
* How long does the bean live? 
* How many instances are created?
* How is the bean shared? 

### Default Scope 
* Default scope is **singleton**

### Refresher: What is Singleton? 
* Spring Container creates only one instance of the baen, by defualt 
* It cached in memory
* All dependency injections for the bean
  * will reference the SAME bean 

* example 
    ```java
    public class DemoController{
        private Coach myCoach; 
        private Coach anotherCoach;
        
        @Autowired DemoController(
                @Qualifier("cricketCoach") Coach theCoach,
                @Qualifier("cricketCoach") Coach theAnotherCoach
        ) {
            myCoach = theCoach;
            anotherCoach = theAnotherCoach; 
        }
    }
    ```
  * both points to the same instance  
so one instance is craeted

### Explicitly Specify Bean Scope
_In class `CricketCoach`_
```java
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach{
    // ... 
}
```

### Additional Spring Bean Scopes 
| Scope       | Description                                                  |
|-------------|--------------------------------------------------------------|
| singleton   | Create a single shared instance of the bean. Default scope.  |
| prototype   | Create a new bean instance for each container request        |
| request     | Scoped to an HTTP web request. Only used for web apps.       |
| session     | Scoped to an HTTP web session. ONly used for apps.           |
| application | Scopped to a web app ServletContext. Only used for web apps. |
| websocket   | Scoped to a web socket. Only used for web apps.              | 

### Prototype Scope Example 
* Prototype scope: new object instance for each injection 
```java
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    // ... 
}
```
* example 
    ```java
    public class DemoController{
        private Coach myCoach; 
        private Coach anotherCoach;
        
        @Autowired DemoController(
                @Qualifier("cricketCoach") Coach theCoach,
                @Qualifier("cricketCoach") Coach theAnotherCoach
        ) {
            myCoach = theCoach;
            anotherCoach = theAnotherCoach; 
        }
    }
    ```
  * each of injection (`theCoach`, `theAnotherCoach`) has it's own instance
  
* to check the scope  
  * at `DemoController`
  * add endpoint ("/check")
  * type this code : 
```java
@GetMapping("/check")
public String check() {
    return "Comparing beans: myCoach == anotherCoach, " + (myCoach == theAnotherCoach); 
    
}
 ```
