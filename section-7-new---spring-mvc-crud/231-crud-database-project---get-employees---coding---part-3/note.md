## 231. CRUD Database Project - Get Employees - Coding - Part 3

### The process 
1. go to website `getbootstrap.com`
2. click on `docs`
3. copy the link of bootstrap css, and paste in the template 
```html
<head>
<!--    <link ....  />-->
</head>
```
4. write the body 

```html
<body>
    <div class="container">
        <h3>Employee Directory</h3>
        <hr>
        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            
            <tbody>
                <tr th:each="tempEmployee : ${employees}">
                    <td th:text="${tempEmployee.firstName}"/>
                    <td th:text="${tempEmployee.lastName}"/>
                    <td th:text="${tempEmployee.email}"/>
                </tr>
            </tbody>
        </table>
    </div>
</body>
```