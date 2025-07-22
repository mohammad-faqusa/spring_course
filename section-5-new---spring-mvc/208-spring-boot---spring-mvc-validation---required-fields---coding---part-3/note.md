## 208. Spring Boot - Spring MVC Validation - Required Fields - Coding - Part 3

#### Step 3 : Develop HTML form and add validation support 

customer-form.html 
```html

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Customer Regisration Form</title>
    
    <style>
        .error {
            color: red; 
        }
    </style>
</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>

<!-- Example of a form -->
<form th:action="@{/processFrom}" th:object="student" method="post">
    
    First name: <input type="text" th:field="*{firstName}" />
    <br><br>
    Last name (*): <input type="text" th:field="*{lastName}" />

<!--    add error message (if presenet) -->
    <span th:if"${#fields.hasError('lastName')}"
          th:errors="*{lastName}"
          class="error"></span>
    
    <br><br>
    
    <input type="submit" value="Submit"/> 
</form>

</body>
</html>

```

css style 