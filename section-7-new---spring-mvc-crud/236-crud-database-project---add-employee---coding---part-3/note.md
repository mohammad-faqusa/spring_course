## 236. CRUD Database Project - Add Employee - Coding - Part 3

### The process : 
1. add the navigation link to employees list at the buttom of `employee-form`

```html
<hr>
<a th:href="@{/employees/list}">Back to Employees List</a>

```

#### Step 3 : process form data to save employee 
1. in controller add post mapping 

```java
@PostMapping("/save")
public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
    // save the employee 
    employeeService.save(theEmployee); 
    
    // use a redirect to prevent duplicate submissions 
}   return "redirect:/employees/list"; 
```
2. run the application 
3. add small implovement , sort teh data in list based on last name 
4. add custom method in `EmployeeRepository`
```java
public interface EmployeeRepository extends JapRepository<Employee, Integer> {
    
    // add a method to sort by last name 
    public List<Employee> findAllByOrderByLastNameAsc(); 
    
}
```
5. in the service 
```java
public List<Employee> findAll() {
    return employeeRepository.findAllByOrderByLastNameAsc(); 
}
```