## 120. Spring Boot REST DAO - Coding - Part 3

### Create rest controller 
1. create new package `rest`
2. create class `EmployeeRestController`
```java
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    // quick and dirty : inject employee dao 
    private EmployeeDAO employeeDAO; 
    
    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO; 
    }
    
    // expose "/employees" and return list of employees 
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll(); 
    }
}

```
3. check in browser with url `/api/employees`
4. also verify in postman
5. compare the results with table content in `pgAdmin`

