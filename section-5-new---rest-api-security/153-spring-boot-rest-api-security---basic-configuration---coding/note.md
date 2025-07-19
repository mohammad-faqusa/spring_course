## 153. Spring Boot REST API Security - Basic Configuration - Coding

### Development Process 
1. Craete Spring Security Configuraiton (@Configuration)
2. Add users, passwords and roles 

#### Step 1: Craete Spring Security Configuraiton (@Configuration)
1. move to cruddemo package, create package `security`
2. create new class `DemoSecurityConfig`
```java
@Configuration 
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailManager userDetailsManager() {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();
        UserDetails mery = User.builder()
                .username("mery")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();
        
        return new InMemoryUserDetailsManager(john, mery, susan); 
    }
}
```
* Since we defined our users here ... 
* Spring Boot will NOT use the user/pass from the `applicaiton.properties`

#### Test the applicaiton
* run the applicaiton 
* using `postman`
* add new request
* try access without credentails `GET http://localhost:8080/api/employees`
  * 404 Unauthorized
* now use authorization 
  * go to authorization tab in postman
  * `Basic Auth`
  * type username and password 
* 