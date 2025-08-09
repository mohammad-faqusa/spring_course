## 306. @OneToMany - Overview - Part 2

#### Add @OneToMany annotation 
```java

public class Instructor {
    
    @OneToMany(mappedBy="instructor")
    private List<Course> courses; 
}
```

#### More on mappedBy 
* MappedBy tells hibernate 
  * look at the instructor property in the Course class 
  * use information from the Course class @JoinColumn 
  * to help find associated courses for instructor 

#### Add support for cascading 
```java

public class Instructor {
    
    @OneToMany(mappedBy="instructor", cascade={
            CascadeType.PERSIST ,
            CascadeType.MERGE ,
            CascadeType.DETACH ,
            CascadeType.REFRESH ,
    })
    private List<Course> courses; 
}
```

```java

public class course {
    
    @ManyToOne(cascade={
            CascadeType.PERSIST ,
            CascadeType.MERGE ,
            CascadeType.DETACH ,
            CascadeType.REFRESH ,
    })
    private Instructor instructor; 
}
```

#### Add convenience methods for bi-directional 
```java

public class Instructor {
    
    @OneToMany(mappedBy="instructor", cascade={
            CascadeType.PERSIST ,
            CascadeType.MERGE ,
            CascadeType.DETACH ,
            CascadeType.REFRESH ,
    })
    private List<Course> courses; 
    
    // add convenience methods for bi-directional relationship 
    public void  add(Course tempCourse)  {
        if(courses == null) {
            courses = new ArrayList<>();
        }
        
        courses.add(tempCourse); 
        
        tempCourse.setInstructor(this); 
    }
}
```