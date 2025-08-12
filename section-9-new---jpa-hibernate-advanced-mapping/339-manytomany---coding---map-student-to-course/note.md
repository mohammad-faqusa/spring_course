## 339. @ManyToMany - Coding - Map Student to Course

### The process 
1. in student class 
```java
public class Student {
    
    @ManyToMany(fetch = FetchType.LAZY,
                cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH },
                mappedBy="students")
    private List<Course> courses;
    
    // add convenience method 
    public void addCourse(Course theCourse) {
        if(course == null) {
            course = new ArrayList<>(); 
        }
        
        course.add(theCourse); 
        theCourse.addStudent(this); 
    }
    
    // getters / setters 
    
}
```