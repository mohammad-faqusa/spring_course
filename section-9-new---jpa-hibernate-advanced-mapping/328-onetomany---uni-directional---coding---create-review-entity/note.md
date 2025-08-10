## 328. @OneToMany - Uni-Directional - Coding - Create Review Entity

### Development Process


### Step 2 : Create Review class 
1. house keeping the project, `04-jpa-one-to-many-uni`
2. change the default schema in `application.properties`, to `hb_04_one_to_many_uni`
3. clean up our main app .
    * delete the comments and called methods in `runner`

#### Step 2 : create review entity 
```java
public class Review {
    
    // define fields 
    
    // define constructors 
    
    // getters / setters 
    
    // toString 
    
    // annotate fields 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; 
    
    @Column(name = "comment")
    private String comment; 
    
    public Review() {
        
    }
    
    public Review(String comment) {
        this.comment = comment; 
    }
    
    // getters / setters 
    
    // toString 
    
    
}
```