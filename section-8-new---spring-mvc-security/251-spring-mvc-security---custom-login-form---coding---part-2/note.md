## 251. Spring MVC Security - Custom Login Form - Coding - Part 2

#### Step 2 : Develop a Controller to show the custom loging form 
1. move to controller, create new class `LoginController`
```java
@Controller
public class LoingController {
    
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        
        return "plain-login"; 
    }
}
```
2. mvoe to `templates` and create `plain-login.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Custom Login Page</title>
</head>
<body>


<h3>My Custom Login Page</h3>
<!-- Example of a form -->
<form th:action="@{/authenticateTheUser}" method="POST">
    <p>
        User name: <input type="text" name="username">
    </p>
    <p>
        Password: <input type="password" name="password">
    </p>
    
    <input type="submit" value="Login">
</form>

</body>
</html>

```