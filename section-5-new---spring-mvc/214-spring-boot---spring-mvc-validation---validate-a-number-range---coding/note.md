## 214. Spring Boot - Spring MVC Validation - Validate a Number Range - Coding

#### Step 1 : add the validaiton role to `Customer` class 
```java
public class Custoemr {
    
    @Min(value=0, message="must be greater htan or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
    private int freePasses; 
}
```

#### Step 2 : display the error message in HTML form 
```html
Free passes : <input type="text" th:field="*{freePasses}"/>

<span th:if="${#fields.hasError('freePasses')}"
        th:errors="*{freePasses}"
        class="error"></span>
```

#### Perform the validation in the controller 
* nothing to update 

#### Update the confirmation page 
echo the passes 
```html
Free passes : <span th:text="${customer.freePasses}"/>
```

run the application 
