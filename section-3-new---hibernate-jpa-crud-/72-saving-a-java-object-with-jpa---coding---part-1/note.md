## 72. Saving a Java Object with JPA - Coding - Part 1

#### Step 1: Define DAO interface 
1. Create a new package: dao
   * create new interface `StudentDAO`
    ```java
    public interface StudentDAO {
        void save(Student theStudent); 
    }
    ```
2. Define DAO implementation
   * in dao, create Class `StudentDAOImpl`
```java
@Repository
public class StudentDAOImpl implements StudentDAO {
    
    // define field for entity manager 
   private EntityManager entityManager; 
   
   // inject enitty manager using constructor injection 
   @Autowired 
   public StudentDAOImpl(EntityManager entityManager) {
       this.entityManager = entityManager; 
   }
   // implement save method 
    @Override 
    @Transactional
    public void save(Stduent theStudent) {
        entityManager.persist(theStudent); 
    }
}
```