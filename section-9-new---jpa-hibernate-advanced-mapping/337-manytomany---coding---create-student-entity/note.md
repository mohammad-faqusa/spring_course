## 337. @ManyToMany - Coding - Create Student entity

### Map the student class to student database table 

### The process 
1. create new entity `Student`
```java
@Entity 
@Table(name="student")
public class Student {
    
    // create fields 
    @Id 
    @GeneratedValue(GenerationType=IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email; 
    
    // define constructor 
    public Student() {
        
    }
    
    // three fields constructor 
    
    // setters / getters 
    
    // to string 
    
    
}
```