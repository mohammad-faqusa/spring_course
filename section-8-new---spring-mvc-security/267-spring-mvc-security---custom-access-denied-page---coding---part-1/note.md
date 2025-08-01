## 267. Spring MVC Security - Custom Access Denied Page - Coding - Part 1

#### Step 1. Configure custom page for access denied 
1. move to `DemoSecurityConfig`
```java
http.exceptionHandling(configurer ->
        configurer
                .accessDeniedPage("/acess-denied")); 

```
2. move to `DemoController`
```java

// add request mapping for /access-denied 
@GetMapping("/access-denied")
public String showAccessDeniedPage() {
    return "access-denied"
}
```