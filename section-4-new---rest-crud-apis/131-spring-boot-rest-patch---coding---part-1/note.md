## 131. Spring Boot REST: PATCH - Coding - Part 1

### The process 
REST controlelr 
```java
public class EmployeeRestController {

    private EmployeeService employeeService;
    
    private ObjectMapper objectMapper; 

    @Autowired
    public EmployeeRestController(EmployeeService employeeService, ObjectMapper objectMapper) {
        this.employeeService = employeeService;
        this.objectMapper = objectMapper; 
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee =  employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee with id " + employeeId + " not found");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);
        Employee employeeDB = employeeService.save(theEmployee);
        return employeeDB;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee  employeeDB = employeeService.save(theEmployee);
        return employeeDB;
    }
    
    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee(@PathVariable employeeId, 
                                  @RequestBody Map<String, Object> patchPayload) {
        // retrieve the employee from the database 
        Employee tempEmployee = employeeService.findById(employeeId); 
        
        // throw exception if null 
        if (tempEmployee = null ) {
            throw new RuntimeException("Employee with id " + employeeId + " not found"); 
            
        }
        if(patchPayload.containsKey("id")){
            throw new RuntimeException("Employee id not allowed in request body - " + employeeId);
        }
        
        // apply patchpayload to the employee 
        Employee patchedEmployee = apply(patchPayload, tempEmployee);
    }
    
    private Employee apply(Map<String, Object> patchPayload, Employee tempEmployee) {
        
    }
}

```
* inject ObjectMapper