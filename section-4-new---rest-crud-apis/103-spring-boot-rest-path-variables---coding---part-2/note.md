## 103. Spring Boot REST Path Variables - Coding - Part 2

### The process 
1. define endpoint for `/students/{studentId}` - return student at index 
```java
public class StudnetRestController {
    
    private List<Student> theStudents; 
    
    // define @PostContruct to laod the student data ... only once!
    
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList(); 
        
        theStudents.add(new Student("mohammad", "faqusa")); 
        theStudents.add(new Student("ahmad", "faqusa")); 
        theStudents.add(new Student("ali", "faqusa")); 
    }
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        
        return theStudents; 
    }
    
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable studentId) {
        
        return Students.get(studentId); 
    }
}
```
2. run the application 
3. test in browser , and `postman`
4. what if input not existed id in URL path ,  
`indexOutOfBound exception`, => server error
5. later we will handle the exception 

the output when `/students/0`
```json
{
    "firstName": "mohammad",
    "lastName": "faqusa"
}
```