## 95. Spring Boot REST Controller - Overview - Part 2

### Development Process
1. Add Maven dependency for Spring Boot Starter Web
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
2. Create Spring REST Service using @**RestController**
```java
@RestController 
@RequestMapping("/test")
public class DemoController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!"; 
    }
}
```