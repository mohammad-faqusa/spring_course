## 240. CRUD Database Project - Delete Employee - Coding

### The process 

1. add the delete button in action column 
`th:href="@{/employees/delete(employeeId=${tempEmployee.id})}"`
`class= "btn-danger btn-sm"`

```html
<td>
    <a href="@{/employees/delete(employeeId=${tempEmployee.id})}" 
    class="btn btn-danger btn-sm"
    onclick="if(!(confirm('Are you sure you want to delete this employee?'))) return  false"></a>
</td>
```

```java
@GetMapping("/delete")
public String delete(@RequestParam("employeeId") int theId)  {
    // delete the employee 
    employeeService.deleteById(theId); 
    // redirect to employee list 
}   return "redirect:/employees/list"; 
```