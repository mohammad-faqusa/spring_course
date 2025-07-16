## 119. Spring Boot REST DAO - Coding - Part 2

#### Process 
1. Create new package `dao`
2. Create interface `EmployeeDAO`
```java
public interface EmployeeDAO {
    
    // list employees 
    List<Employee> findAll(); 
    
    // get employee by id 
}
```
3. Create DAO Implementation, `StudentDAOImpl`
```java
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
    // define field for entityManager 
    private EntityManager entityManger; 
    // set up constructor injection 
    @Autowired 
    public EmployeeDAOJpaImpl(EntityManger entityManger) {
        this.entityManger = entityManger; 
    }
    @Override 
    public List<Employee> findAll() {
        
        TypedQuery<Employee> theQuery = entityManger.createQuery("from Employee", Employee.class);
        
        // execute the query and get result list 
        List<Employee> employees = theQuery.getResultList(); 
        
        return employees; 
    }
}
```