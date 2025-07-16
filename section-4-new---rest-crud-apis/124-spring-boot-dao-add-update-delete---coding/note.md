## 124. Spring Boot DAO: Add, Update, Delete - Coding

#### Add new methods to EmployeeDAO
```java
public interface EmployeeDAO {

    List<Employee> findAll();
    
    Employee findById(int theId); 
    
    Employee save(Employee theEmployee); 
    
    void deleteById(int theId); 
}

```

#### Add new methods to EmployeeDAOImpl
```java
@Repository
@Override
public List<Employee> findAll() {
    TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

    // execute the query
    List<Employee> employees = query.getResultList();

    // return the results
    return employees;
}

@Override
public Employee findById(int theId) {
    // get employee 
    Employee theEmployee = entityManager.find(Employee.class, theId); 
    
    // return employee
    return theEmployee;
}

@Override
public Employee save(Employee theEmployee) {
    Employee dbEmployee = entityManager.merge(theEmployee); 
    return dbEmployee; 
}

@Override
public void deleteById(int theId) {
    // find employee by id 
    Employee theEmployee = entityManager.find(Employee.class, theId);
    
    // remove employee 
    entityManager.remove(theEmployee); 
}
```
* in `save(theEmployee)` : if (id == 0) then insert/save , else update 
* 