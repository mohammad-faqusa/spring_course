## 268. Spring MVC Security - Custom Access Denied Page - Coding - Part 2

### The process

1. create new template file `access-denied`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>luv2code - Access Denied</title>
</head>
<body>

<h2>Access Denied - You are not authorized to access this resource.</h2>

<hr>

<a th:href="@{/}">Back to home page</a>
</body>
</html>

```