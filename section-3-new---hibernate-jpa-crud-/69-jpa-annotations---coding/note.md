## 69. JPA Annotations - Coding

### The process
1. create new package `entity`
2. inside `entity` create new class `student`
3. map the class to database table
```java
@Entity
@Table(name="student")
public class Student {
    
    // define fields 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id; 
    
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    
    // define constructors
    public Student() {
        
    }
        // generate constructor 3 parameters (firstname, lastname, email)
    
    // define getters/setters
        //generate using IDE 
    //define toString() method
        //generate using IDE 
}
```