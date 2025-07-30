## 244. Spring MVC Security - Project Set Up - Part 2

### The process 
1. houseKepping configs for `devtools`


#### Step 2 : develop Spring controller 
1. create new package `controller`
2. create new class `DemoController`
```java

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String showHome() {
        
        return "home"; 
    }
    
    
}
```
3. create the home page , in templates `home.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Mohmmad Faqusa Company Page</title>
</head>
<body>
    <h2>Mohammad Faqusa Company Home page</h2>
<hr>
Welcome to the Mohammad Faqusa Company home page! 


</body>
</html>

```
4. run the application 
5. user the generated password in the console 
6. default : 
   1. user : user 
   2. password : <from the console> 

