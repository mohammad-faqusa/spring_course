## 216. Spring Boot - Spring MVC Validation - Applying Regular Expressions - Coding

### The process 
```java
public class Customer {
    
    @Pattern(regex="^[a-zA-z0-9]{5}", message="only 5 chars/digits") 
    private String postalCdoe; 
}
```

#### Display the error on html form : 
```html
<span th:if"${#fields.hasErrors('postalCode')}"
        th:errors="*{postalCode}"
        class="error"; ></span>
```