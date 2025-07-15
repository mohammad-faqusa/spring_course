## 106. Spring Boot REST Exception Handling - Coding - Part 1

### Development Process
1. Create a custom error response 
2. Create a custom exception class 
3. Update REST service to throw exception if student not found 
4. Add an exception handler using **@ExceptionHandler** 

#### Step1 : Create custom error class 
1. move to `rest` package 
2. create Class `StudentErrorResponse`
```java
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp; 
    
    // define constructors 
    public StudentErrorResponse() {
        
    }

//    public StudentErrorResponse(int status, ...) {
//
//    }
    
    // setters / getters 
}
```

#### Step 2: create StudentNotFoundException 
```java
public class StudentNotFoundException extends RuntimeException {
    
    public StudentNotFoundException(String message) {
        super(message); 
    }
    public StudentNotFoundException(String message, Throwable cause ) {
        super(message, cause); 
    }
    public StudentNotFoundException(Throwable cause) {
        super(cause); 
    }
}
```