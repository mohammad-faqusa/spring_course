## 243. Spring MVC Security - Project Set Up - Part 1

### Development Process 
1. Create project at Stpring initailizer website 
   1. Add Maven dependencies for Spring MVC Web App, Security, Thymeleaf
2. develop our Spring controller 
3. Develop our Thymeleaf view page 

#### Step 1 : Add Maven dependencies for Spring MVC Web App
```xml
<dependency>
    <artifactid>spring-boot-starter-security</artifactid>
</dependency>
<dependency>
    <artifactid>thymleaf-extras-springsecurity6</artifactid>
</dependency>
```

#### Step 2 : dvelop the controller 

```java
@Controller 
public class DemoController {
    @GetMapping("/")
    public String showHome() {
        return "home"; 
    }
}
```

#### Step 3 : Develop our Thymeleaf view page 
```html
<body>
    welcome to the luv2code company page !
    
</body>
```

### Steps : 
1. create the project in starter 
   1. group : `com.luv2code.springboot`
   2. artifactId: `demosecurity`
   3. add depenedencies 
      1. web 
      2. thymeleaf 
      3. security 
      4. devtools 
2. download the project 
3. copy to our workplace 
4. `08-spring-boot-spring-mvc-security`
5. rename the project : `01-spring-boot-spring-mvc-security-defualt`
6. open in IDE 
7. 