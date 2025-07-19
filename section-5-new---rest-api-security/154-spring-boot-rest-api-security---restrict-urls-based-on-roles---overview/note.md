## 154. Spring Boot REST API Security - Restrict URLs based on Roles - Overview

### Our Example 
| HTTP method | endpoint                    | CRUD Action     | Role     |
|-------------|-----------------------------|-----------------|----------|
| GET         | /api/employees              | Read all        | EMPLOYEE |
| GET         | /api/employees/{employeeId} | Read single     | EMPLOYEE |
| POST        | /api/employees              | Create          | MANAGER  |
| Put         | /api/employees              | Read all        | MANAGER  |
| DELETE      | /api/employees/{employeeId} | Delete Employee | ADMIN    | 


### Restricting Access to Roles 
* General Syntax
```java
requestMatchers(<<add path to match on >>).hasRole(<<authorized role>>)
```
* add path  to match on : Restrict access to a given path `api/employees`
* has role : `single role`, for exmaple : `Admin`

requestMatchers(<< add HTTP METHOD to match on>>, <<add path to match on >>).hasRole(<<authorized role>>)

#### Authorize Requests for EMPLOYEE role 
```java
requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE") // READ all employees 
requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE") // read a single employee
requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER") // add an employee 
requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER") // update an employee 
requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN") // has role admin
```

### Pull It Together 
```java
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(configurer -> {
        configurer
                .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE") // READ all employees 
                .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE") // read a single employee
                .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER") // add an employee 
                .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER") // update an employee 
                .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN"); // has role admin

    });
    
    // use HTTP basic authentication 
    http.httpBasic(Customizer.withDefaults()); 
    
    return http.build(); 
}
```

### Cross-Site Request Forgery (CSRF)
* Spring Security can protect against CSRF attacks 
* Embed additional authentication data/token into all HTML forms 
* On subsequent requests, web app will verify token before processing 
* Primary use case is traditional web applications (HTML forms etc ...) 

### When to use CSRF Protection 
* The Spring Security team recommends 
  * Use CSRF protection for any normal browswer web requests 
  * Traditional web apps with HTML forms to add/modify data
* If you are building a REST API for non-browser clients 
  * you many want to disable CSRF protection 
* In general, not required for stateless REST APIs
  * That use  POST, PUT, DELETE and/or PATCH

### Put It Together 
 

