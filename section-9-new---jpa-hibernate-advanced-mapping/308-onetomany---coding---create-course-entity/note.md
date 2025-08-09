## 308. @OneToMany - Coding - Create Course entity

### the process 
1. house keeping the `02` to name `03-jpa-one-to-many`


#### Create course class 
```java
@Entity
@Table(name="course")
public class course {
    // define fields 
    @Id 
    @GenerateValue(GenerationType.)
    private int id; 
    
    private string title; 
    
    private Instructor instructor;
    
    // define constructors 
    public Course() {
        
    }
    
    public Course(String title) {
        
    }
    // getters / setters 
    
    // define toString : all except for instructor 
    
    // annotate fields 
    
    
}
```