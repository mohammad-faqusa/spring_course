## 102. Spring Boot REST Path Variables - Coding - Part 1

### The process 
1. move to `StudentRestController`
2. refactor the code of `getStudents()`
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