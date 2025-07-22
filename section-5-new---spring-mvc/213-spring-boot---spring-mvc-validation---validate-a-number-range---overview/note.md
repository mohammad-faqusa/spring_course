## 213. Spring Boot - Spring MVC Validation - Validate a Number Range - Overview

### Validate a Number Range 

* Add a new input field on our form for : free Passes
* user can only enter range 0 to 10 


### Developpment process 
1. add validation rule to Customer class 
2. display error message on HTML form
3. perform validation on Controller 
4. update confirmation page 


```java
public class Customer {
    
    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
}
```