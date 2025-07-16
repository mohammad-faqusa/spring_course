## 130. Spring Boot REST: PATCH - Overview - Part 2

### PATCH - Development Process 
1. Inject helper class: ObjectMapper
2. Add support for `@PatchMapping` request method 
3. Apply patch payload to employee 

#### Step 1: Inject helper class : Object Mapper 
* `ObjectMapper` is a helper class in the jackson library for JSON processing 
* `OjbectMapper` provides following support 
  * Converts Java objects to JSON and vice-versa
  * Allows merging of JSON nodes
  * Provides type safety for conversion: Java <->JSON
* The `ObjectMapper` is preconfigured by Spring Boot 

```java
public class EmployeeRestController {
    
    @Autowired
    public EmployeeRestController(EmployeeService employeeService, ObjectMapper objectMapper) {
        this.employeeService = employeeService;
        this.objectMapper = objectMapper; 
    }
    
    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee(@PathVariable int employeeId, @RequestBody Map<String, Object> patchPayload) {
        
        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null ) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        
        // throw exception if request body updates contains id 
        if(patchPayload.containKey("id") {
            throw new RuntimeException("Employee id not allowed in request body - " + employeeId);
        }
        
        Employee patchEmployee = apply(patchPayload, tempEmployee); 
        Employee dbEmployee = employeeService.save(patchEmployee);
        
        return dbEmployee; 
        
    }
}
```
* the `id` fields is not allowed in patch 
* apply : apply the partial updates , **method defined in next step** 
```java
private Employee apply(Map<String, Object>patchPayload, Employee tempEmployee) {
    // Convert employee ojbect to a JSON object node 
    ObjectNode employeeNode = objectMapper.convertValue(tempEmployee, ObjectNOde.class); 
    
    // Convert the patchPayload map to a JSON object node
    ObjectNode patchNode = objectMapper.convertValue(patchPayload, ObjectNOde.class); 
    
    // Merge the patch updates into the employee node
    employeeNode.setAll(patchNode); 
    
    return objectMapper.vonertValue(employeeNode, Employee.class); 
    
}
```

### PATCH
* the approach shown in the previous slides covers the majority of use cases for parital updates 
* However, if you have complex use cases
  * Depply nested JSON entities 
  * Add, move, remove, copy fields
  * Move /manipulate array elements 
  * Complex transformation / data enrichment 
* `RFC 6902 - JSON Patch`
* `RFC 7386 - JSON Patch`
* json patch project - github 
