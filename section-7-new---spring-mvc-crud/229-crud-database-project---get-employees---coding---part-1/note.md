## 229. CRUD Database Project - Get Employees - Coding - Part 1

### The process 
1. create package `controller`
   * create new class `EmployeeController`

```java
@Controller
@RequestMapping("/employees")
public class EmployeeController {
    
    
    private EmployeeService employeeService;
    
    // @Autowired is optional 
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService; 
    }
    
    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        
        // get the employees from db 
        List<Employee> theEmployees = employeeService.findAll();
        
        // add to the spring model
        theModel.addAttribute("employees", theEmployees); 
        
        return "list-employees"; 
    }
}
```
* if we have 
  * one constructor in the class, the `@Autowired` is optional 

2. next video, we will **create thymeleaf template**

