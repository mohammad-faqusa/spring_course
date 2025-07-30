## 239. CRUD Database Project - Delete Employee - Overview

### Delete the employeee 

#### hint to ensure for delete 

### Development process 
1. Add "Delete" button 
2. add controller code for "Delete"

```html
<tr th:each="tempEmployee : ${employees}">
            <td th:text="${tempEmployee.firstName}"/>
            <td th:text="${tempEmployee.lastName}"/>
            <td th:text="${tempEmployee.email}"/>
            <td><a class="btn btn-primary" th:href="@{/employees/showFormForUpdate(employeeId=${tempEmployee.id})}">Update</a></td>
            <td><a th:href="@{/employees/delete(employeeId=${tempEmployee.id})}"></a></td>
        </tr>

```

in controller 
```java
@GetMapping("/delete") 
public String delete(@RequestParam("employeeId") int theId) {
    
    // delete the empoloyee 
    employeeService.deleteById(theId); 
    
    // redirect to employee/list 
    return "redirect:/employees/list"; 
}
```