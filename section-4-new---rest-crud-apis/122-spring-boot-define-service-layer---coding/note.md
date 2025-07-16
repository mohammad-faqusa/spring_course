## 122. Spring Boot Define Service Layer - Coding

### The process
1. create new package `service`
2. create new interface `EmployeeService`
```java
public interface EmployeeService {
    
    List<Employee> findAll(); 
}
```
3. create new class `EmployeeServiceImpl`
    ```java
    @Service 
    public class EmployeeServiceImpl implements EmployeeService {
        
        private EmployeeDAO employeeDAO ; 
        
        public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
            this.employeeDAO = employeeDAO; 
        }
        @Override 
        List<Employee> findAll() {
            return employeeDAO.findAll(); 
        } 
        
    }
    ```
   * setup constructor injection
   * override the `findAll()` method 
4. move to `EmployeeRestController`
```java
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }
}

```