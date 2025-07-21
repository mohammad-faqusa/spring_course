## 180. Spring Boot - Hello World Form and Model - Coding - Part 1

### The process

#### 1: Create hello world controller 
1. move to `controller`
2. create class `HelloWorldController`
```java
@Controller
public class HelloWorldController {
    
    // new a controller method to show initial HTML form 
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form"; 
    }
    
    // need a contorller method to process the HTML form 
}
```
3. create the **view** page 
4. create file `helloworld-form.html`
```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <title>Hello World - Input Form</title>
    </head>
    <body>
        <form th:action="@{/processFrom}" method="GET">
            <input type="text" name="studentName" placeholder="What's your name?"/>
            
            <input type="submit"/>
        </form>
    </body>
</html>
```