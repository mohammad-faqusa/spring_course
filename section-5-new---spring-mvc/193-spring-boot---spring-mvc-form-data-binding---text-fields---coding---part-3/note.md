## 193. Spring Boot - Spring MVC Form Data Binding - Text Fields - Coding - Part 3

### Step 5: Create Confirmation page 
1. craete `student-confirmation.html` in templates

```html
<body>
The student is confirmed : <spam th:text="${student.firstName} + ' ' + ${student.lastName}"/>
</body>
```

