## 111. Spring Boot REST Global Exception Handling - Coding
1. Create new `@ControllerAdvice`
2. Refactor REST service , _remove exception handling code_
3. Add exception hadnling code to `@ControllerAdvice`


### Step 1: Create new `@ControllerAdvice`
1. in rest package, create `StudentRestExceptionHandler`
```java
@ContrllerAdvice
public class StudentRestExceptionHandler {
    // add exception handling code here 
    
    // copy and paste the exception handler from `StudentRestController`
    
}
```