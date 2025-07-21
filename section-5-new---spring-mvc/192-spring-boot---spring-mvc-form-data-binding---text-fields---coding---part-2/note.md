## 192. Spring Boot - Spring MVC Form Data Binding - Text Fields - Coding - Part 2

#### Step 3: create HTML form
1. move to template directory 
2. create new file `student-form.html`

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

    <head>
        <meta charset="UTF-8"/>
        <title>Student Regisration From</title>
    </head>
    <body>
    
        <h3>Student Registration From</h3>
    
        <form th:action="@{/processStudentForm}" th:object="${student}" method="POST">
            First name: <input type="text" th:field="*{firstName}"/>
            
            <br><br>
    
            Last name: <input type="text" th:field="*{lastName}"/>

            <br><br>
            
            <input type="submit" value="Submit"/> 
    </body>
</html>
```
* `        <form th:action="@{/processStudentForm}" th:object="${student}" method="POST">` the object is the name of **attribute** of model form rest contorller

#### Step 4: craete Processing code 
* define new method in `StudentController`

```java
@PostMapping("/processStudentForm")
public String processForm(@ModelAttribute("student") Student theStudent) {

    System.out.println(student);
    
    return "student-confirmation"; 
}
```