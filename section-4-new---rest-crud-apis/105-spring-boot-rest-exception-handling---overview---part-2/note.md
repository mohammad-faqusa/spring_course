## 105. Spring Boot REST Exception Handling - Overview - Part 2

#### Step 3: Update REST service to throw exception 
```java
@RestController
@RequestMapping("/api")
public class StudentRestController {
    
    @GetMapping("/studetns/{studentId}")
    public Student getStudent(@PathVariable studentId) {
        
        // check the studentId agains list size
        if((studentId >= theStudents.size()) || (studentId <0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId); 
        }
        
        return theStudents.get(studentId); 
        
    }
}
```
* simualted to DB , if we didn't get results, then **throw new exception** 

#### Step 4: Add exception handler method 
* Define excepiton handler method(s) with `@ExceptionHandler` annotation 
* Exception handler will reutrn a ResponseEntity
* ResponseEntity is a wrapper for the HTTP response object
* **ResponseEntity** provies fine-grained control to specify: 
  * HTTP status code, HTTP headers nad response body 
```java
@RestController
@RequestMapping("/api")
public class StudentRestController {
    
    // ... 
    
    @ExcepitonHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        StudentErrorResponse error = new StudentErrorResponse(); // this class we have created earlier 
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
    }
}
```

### Recap 
1. send bad data
2. throw exception 
3. exception handler, 
   * custom response 
   * error going back in 404 json 

