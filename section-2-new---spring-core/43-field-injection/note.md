## Field Injection with Annotations and Autowiring

### Spring Injection Types:
#### Recommended by the spring.io development team 
* **Constructor Injection**: required dependencies
* **Setter Injection**: optional dependencies
#### Not Recommended by the spring.io development team 
* **Field Injection** 

### Field Injection - no longer cool
* in the early days, field injection was popular on Spring projects
  * in recent years, it has fallen out of favor
* in general, it makes the code harder to unit test 
* As a result, the **spring.io** team does not recommend field injection 
  * However, you will still see it being used on legacy projects

### what is field injection 
inject dependencies by setting field values on your class directly (even private fields)
**Accomplished by using Java Reflection**

### Steps 
#### Step 1: Configure the dependency injection with Autowired Annotation
_File: DemoController.java_
```java
@RestController
public class DemoController {
    
    @Autowired
    private Coach myCoach;
    
    // no need for constructors or setters 
}
```
