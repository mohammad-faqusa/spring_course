## 104. Spring Boot REST Exception Handling - Overview - Part 1

### Remember our Problem ? 
* Bad student id of **999** 
```json
{
    "timestamp": "2025-07-15T19:29:16.636+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "path": "/api/students/20"
}
```
* we really want 
  * handle the exception and return error as JSON 
    ```json
    {
      "status": 404,
      "message": "Student id not found - 999",
      "timeStamp": 12223454
    }
    ```

### Spring REST Exception handling 
sequence : 
1. request with student id 999
2. Rest does not found the student with this id 
3. Rest throw exception 
4. Exception handler 
5. send back error message as JSON

### Development PRocess 
1. Create a custom error response class
2. Create a custom exception class 
3. Update REST service to throw exception if student not found 
4. Add an exception handler method using `@ExceptionHandler`

#### Step 1: Create custom error response class 
* The custom error reposne class will be sent back to client as JSON
* We will define as Java class `POJO`
* `Jackson` will handle converting it to **JSON**
```java
class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp; 
    
    // constructors 
    
    // setters/getters 
    
}
```
* You can define any custom fields that you want to track in `StudentErrorResponse`
* to generate this JSON message 
    ```json
    {
      "status": 404,
      "message": "Student id not found - 999",
      "timeStamp": 12223454
    }
    ```

#### Step 2: Create custom student exception 
* The custom student exception will used by our REST service
* In our code, if we can't find student, then we'll throw an exception
* Need to define a custom student exception class
  * `StudentNotFoundException`
_File: `StudentNotFoundException`_
```java
public class StudentNotFoundExceptoin extends RuntimeException {
    public StudentNotFoundExceptoin(String message) {
        super(message); 
    }
}
```
