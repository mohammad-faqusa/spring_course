## 127. Spring Boot REST: Add Employee - Coding

#### Step 5: Add new employee 
_EmployeeRestController.java_
```java
// add mapping for POST /employees - add new employee 
@PostMapping("/employees")
public Employee addEmployee(@RequestBody Employee theEmployee) {
    // also just in case they pass an id in JSON ... set id to 0
    // this is to force a save of new item ... instead of update 
    
    theEmployee.setId(0);
    Employee dbEmployee = employeeService.save(theEmployee);
    
    return dbEmployee; 
}
```
* if your `Employee` class has : `private int id`
  * then you can use theEmployee.setId(0); 
* However, if have alternative coding in Employee class : 
  * `private Integer id`
  * then you must use `theEmployee.setId(null)`

* send the data through json , in `postman`
