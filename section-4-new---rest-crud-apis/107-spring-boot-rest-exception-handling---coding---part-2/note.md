## 107. Spring Boot REST Exception Handling - Coding - Part 2

### Development process
we had covered step 1 and 2 

### Step 3: Update REst service to throw exception 
```java

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // ...      
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // check the student id : 
        if(studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        
        return theStudents.get(studentId);
    }


}

```

#### Step 4: add an exception andler using @ExceptionHandler

```java

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // ...      
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // check the student id : 
        if(studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        
        return theStudents.get(studentId);
    }

    // add an exception handler @ExceptionHandler 
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        
        // create a StudentErrorResponse 
        StudentErrorResponse error = new StudentErrorResponse(); 
        error.setStatus(HttpStatus.NOT_FOUND.value()); 
        error.setMessage(exc.getMessage()); 
        error.setTimeStamp(System.currentTimeMillis()); 
        
        
        
        // return a ResponseEntity 
        
        
        return new ResponseEntity<>(error, HttpStatus.NOU_FOUND);  
    }
}
```