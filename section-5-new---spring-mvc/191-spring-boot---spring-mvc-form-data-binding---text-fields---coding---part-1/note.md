## 191. Spring Boot - Spring MVC Form Data Binding - Text Fields - Coding - Part 1

### The development process 

#### Step 1: create the student class : 
1. create new package `model`
2. Create new Student class `Student`
```java
public class Student{
    
    private String firstName; 
    
    private String lastName; 
    
    public Student() {
        
    }
    
    // getters and setters
    
    // toString
    
}
```
3. create `StudentController`
```java
@Controller
public class StudentController{
    
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {
        
        // creat e a student object 
        Student theStudent = new Student(); 
        
        // add student object to the model 
        theModel.addAttribute("student", theStudent); 
        
        return "student-form"; 
    }
}
```