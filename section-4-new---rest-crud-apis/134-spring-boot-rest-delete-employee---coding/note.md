## 134. Spring Boot REST: Delete Employee - Coding

### Step 6: Delete Employee 
EmployeeRestController 

```java
@DeleteMapping("/employees/{employeeId}")
public String deleteEmployee(@PathVariable int employeeId) {
    
    Employee tempEmployee = employeeServices.findById(employeeId);
    
    if(tempEmployee == null) {
        throw new RuntimeException("This employee with id : " + employeeId + " does not exist in Database");
    }
    
    employeService.deleteId(employeeId); 
    
    return "Deleted employee id - " + employeeId; 
}
```

* run the application 
* move to postmane 
* change the method to `delete`
* the `body` type is `none`
* specify the id of employee in url