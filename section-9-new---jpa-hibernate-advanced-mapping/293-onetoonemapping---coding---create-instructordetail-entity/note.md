## 293. @OneToOneMapping - Coding - Create InstructorDetail entity

### Development Process : 

#### Step 2: Create InstructorDetail class 
1. create new package called `entity`
2. inside the package, create `InstructorDetail` class
```java

@Entity 
@Table(name="instructor_detail")
public class InstructorDetail { 
    
    // annotate the class as an entity and map to db table 
    
    // define the fields 
    
    // annotate the fields with db column names 
    
    // create constructors 
    
    // generate getter/setter methods 
    
    // generate toString() method 
    @Id 
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="youtube_channel")
    private String youtubeChanel;
    
    @Column(name="hobby") 
    private String hobby; 
    
    public InstructorDetail() {
        
    }
    
    // use ide to generate the constructor : choose channel, hobby , without id 
    
    // setters/ getters from IDE 
    
    // generate toString() 
}
```