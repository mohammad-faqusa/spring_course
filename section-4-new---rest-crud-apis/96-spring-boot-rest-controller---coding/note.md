## 96. Spring Boot Rest Controller - Coding

###  The process 
1. go to Spring Initializr
   * choose latest 3 version 
   * group : `com.luv2code`
   * artifact : `demo`
   * packaging : `jar`
   * dependencies : `spring web`
   * downlaod the project 
2. unzip the file
3. copy the folder in `dev-spring-boot` folder,  
in section with name : `04-spring-boot-rest-crud`  
with copied name : `01-spring-boot-rest-crud`
4. open the project in `intellig IDE`
5. create new `package` in `demo` , called `rest`
6. Create `@RestController`, with Class name `DemoRestController`
```java
@RestController
@RequestMapping("/test")
public class DemoRestController {
    
    // add code for the "/hello" endpoint 
    
    @GetMapping("/hello")
    public String sayHello() {
        return "HelloWorld!"; 
    }
}
```
7. go to browser and type : `localhost:8080/test/hello`
8. go to postmant, with GET request, paste the same **url** 

