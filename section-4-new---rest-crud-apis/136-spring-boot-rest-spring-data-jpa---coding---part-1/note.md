## 136. Spring Boot REST: Spring Data JPA - Coding - Part 1

### The process : 
1. HouseKeeping : copy and paste last project  
`30-spring-boot-rest-crud-employee-with-spring-data-jpa`
2. delete all files in `dao` package 
3. create sprring data JPA repository 
   * interface : `EmployeeRepository`
```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
    // that's it .. no need to write any code LOL!
    
}
```

#### Step 2: use the repo in our app 
EmployeeService 
```java
private EmployeeRepository employeeRepository


```
*  remove the employeeDAO
* inject the repo
* remove `@Transactional`
* replace the employeeDAO with employeeRepository

```java
@Override 
public Employee findById(int theId) {
    Optional<Employee> result = employeeRepository.findById(theId); 
    Employee theEmployee = null; 
    
    if(result.isPresent()) {
        theEmployee = result.get(); 
    } else {
        // we didn't find the employee
       throw new RuntimeException("Did not find employee id - " + theId); 
    }
    
    return theEmployee; 
}
```