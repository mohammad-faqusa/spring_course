## 109. Spring Boot REST Exception Handling - Coding - Part 4

### The process
1. move to `StudentRestController` 
2. add another exception handler 
```java
@ExceptionHandler
public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {

    // define the response entity
    StudentErrorResponse response = new StudentErrorResponse();
    response.setMessage(exc.getMessage());
    response.setStamp(System.currentTimeMillis());
    response.setStatus(HttpStatus.BAD_REQUEST.value());

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

}
```
* **notice** the changed `status code` to `BAD_REQUEST`