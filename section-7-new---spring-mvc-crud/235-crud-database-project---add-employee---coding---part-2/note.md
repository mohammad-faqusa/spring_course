## 235. CRUD Database Project - Add Employee - Coding - Part 2

### The process 
1. move to the Controller, and add get mapping 

```java
@GetMapping("/showFormForAdd")
public String showFromForAdd(Model theModel) {
    
    // create the model attrbiute to bind form data
    
    Employee theEmployee = new Employee(); 
    
    theModel.addAttribute("employee", theEmployee); 
    
    return "employees/employees-form"; 
}
```
2. create new template `employee-form.html`
3. copy all the header section from `employee-list` and paste in `employee-form.html`
```html
<head>
    <meta charset="UTF-8">
    <title>My Thymeleaf Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css">
    <title>Save Employee</title>
    
</head>
<body>
    <div class="container">
        <h3>Employee Directory</h3>
        <hr>
        
        <p class="h4 mb-4">Save Employee</p>
        
        <form action="#" th:action="@{/employees/save}" 
        th:object="${employee}" method="POST">
            <input type="text" th:field="*{firstName}" class="form-control mb-4 w-25" placeholder="First Name">
            <input type="text" th:field="*{lastName}" class="form-control mb-4 w-25" placeholder="Last Name">
            <input type="text" th:field="*{email}" class="form-control mb-4 w-25" placeholder="Email">
        
            <button type="submit" class="btn btn-info col-2">Save</button>
        </form>
    </div>

</body>
```