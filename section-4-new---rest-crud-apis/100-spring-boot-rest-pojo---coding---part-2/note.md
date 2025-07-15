## 100. Spring Boot REST POJO - Coding - Part 2

### Step 2: Create Rest Controller 
1. `rest` package
2. create new class `StudentRestController`
```java
@RestController
@RequestMapping("/api")
public class StudentRestController{
    
    // define endpoints for "/students" = return list of students 
    @GetMapping("/students")
    public List<Student> getStudents() {
        // create sample students 
        
        // We'll hard code, for now,
            // DB later 
        
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Stduent("mohammad", "faqusa")); 
        theStudents.add(new Stduent("ahmad", "faqusa")); 
        theStudents.add(new Stduent("ali", "faqusa")); 
        
        return theStudents ;
    }
}
```
3. run the application, to check how it works  
move to browser `localhost:8080/api/students`
4. check the URL in `postman`
