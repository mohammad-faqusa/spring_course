## 206. Spring Boot - Spring MVC Validation - Required Fields - Coding - Part 1
1. Create Customer class and add validation rules 
2. add contoller code to show HTML form 
3. Develop HTML form and add validation support 
4. Perform validaiton in the contorller class 
5. Create confirmation page 

#### Step 1 : creat cutsomter class and add vlaidaiton rules 
1. create new class Cusotmer 
```java
public class Customer {
    
    
    pirvate String firstName; 
    
    @NotNull(message="is required")
    @Size(min=1 , message="is required")
    private String lastName = "" ; 
    
    // getters / setters 
    
    // to string 
}
```
* for `NotNull` make jekarta modification as default annotation 
* 