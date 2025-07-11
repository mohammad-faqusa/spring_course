# Constructor Injection How Works Behind The Scenes 

## How Spring process your application 
we have: 
* `Coach.java`
* `CricketCoach.java`
* `DemoController.java`

1. Spring will create a new instance of Coach  
    ```java 
    Coach theCoach = new CricketCaoch();
    DemoController demoController = new DemoController(theCoach);
    ```  
   **note that** : the Coahc is the dependency or the helper for actual **Controller**  
**The "new" keyword ... is that it ???** 
   * You may wonder ...
     * Is it just the "new keyword???"
     * I don't need Spring for this ... I can do this by myself LOL!!!
   * Spring is more that just Inversion of Control and Dependency Injection
   * For small basic apps, it may be hard to see the benefits of Spring

## Sptring for Enterprise applications 
* Sptirng is targetetd for enterprise, real-time / real-world applications 
* Spring provides features such as 
  * Database access and Transactions 
  * REST APIs and Web MVC
  * Security
  * etc ...

## Later in the course 
* we will build a real-time CRUD REST API with database access
* You will see the Spring features in action
* Good things are coming :-)

