## 295. @OneToOneMapping - Coding - Create the DAO

#### 4.1 Create DAO Interface 
#### 4.2 Create DAO impl
#### 4.3 Main app 

### The process 
1. create new package `dao`
2. in package `dao`, create interface `AppDAO`
```java
public insterface AppDAO {
    
    void save(Instructor theInstructor); 
}
```
3. in package `dao`, craete new class : `AppDAOImpl`
```java
@Repository
public class AppDAOImple implements AppDAO {
    
    // define field for entity manager 
    private EntityManager entityManager; 
    
    // inject entity manager using constructor injection
    @Autowired 
    public AppDAOImple(EntityManager entityManager) {
        this.entityManager = entityManager; 
    }
    
    @Override 
    @Transactional
    public void save(Instructor theInstructor) {
        entityManger.persist(theInstructor); 
    }
}
```
* notice `entityManger.persist` will also operated on `InstructorDetail` becuase of **CascadeType.ALL** 

