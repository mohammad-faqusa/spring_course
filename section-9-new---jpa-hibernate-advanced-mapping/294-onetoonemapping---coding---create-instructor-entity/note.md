## 294. @OneToOneMapping - Coding - Create Instructor entity

### Development Process
#### Step 3: create Instructor class 

1. create class in package `entity`
```java
@Entity 
@Table(name="instructor")
public class Instructor {
    // annotate the class as an entity and map to db table 

    // define the fields 

    // annotate the fields with db column names 

    // ** setup up mapping to InstructorDetail entity ** 
    
    // create constructors 
        // default consturctor 
        // params : all except for id and instructorDetail 

    // generate getter/setter methods 

    // generate toString() method 
    
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
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="instructor_detail_id")
    private InstructorDetail instructorDetail; 
}
```
* `"instructor_detail_id"` : 
  * defined in instructor table 
  * in database, foreign key is configured to reference id field in instructor_detail table
* generate the constructor 
* generate the getters/setters 
* generate toString 