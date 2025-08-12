## 338. @ManyToMany - Coding - Map Course to Student

#### Step 2: Update Course class 
1. go to entity `Course`
```java
package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="course")
public class Course {

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(
        name="course_student",
            joinColumns=@JoinColumn(name="course_id"),
            inverseJoinColumns=@JoinColumn(name="student_id")
    )
    private List<Student> students;
    
    // getters / setters 
    
    // add a convenience method 
    public void addStudent(Student theStudent) {
        if (students == null) {
            students = new ArrayList<>();
        }
        
        students.add(theStudent); 
    }

}


```
* create students field
* stters and getters 
* `addStudent`
* add annotation 