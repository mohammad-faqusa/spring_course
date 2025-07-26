## 175. Spring Boot - Spring MVC with Thymeleaf - Coding - Part 2

### The process 
1. create package : `controller`
2. develop MVC controller , create `DemoController`

```java
@Controller
public class DemoController {
    
    // create a mapping for "/hello"
    
    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theDate", java.time.localDateTime.now());

        return "helloworld";
    }
}
```
* be sure to use correct import : `org.springframework.ui`
3. create thymeleaf tempolate 
   1. go to `resources`
   2. create `templates` directory 
   3. create html file `helloworld.html`
```html
<!DOCTYPE HTML> 
<HTML xmlns:th="http://www.thymeleaf.org">
<headh>
    <title>thymeleaf demo</title>
    
    <body>
        <p th:text="'Time on the server is ' + ${theDate}" />
    </body>
</headh>
</HTML>
```
4. run the application, `localhost:8080/hello`

