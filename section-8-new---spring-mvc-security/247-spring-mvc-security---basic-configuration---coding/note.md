## 247. Spring MVC Security - Basic Configuration - Coding

### Development Process 
1. Creat eSpring Security Configuraiton (@Configuration)
2. Add users. passwords and roles 


### Steps 
1. create new package : `security`
2. create new class `DemoSecurityConfig`
```java
@Confiugraion
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        
        UserDetails john = User.builder()
                .username("john")
                .passwrod("{noop}test123")
                .roels("EMPLOYEE")
                .build(); 
        
        UserDetails mary = User.builder()
                .username("mary")
                .passwrod("{noop}test123")
                .roels("EMPLOYEE", "MANAGER")
                .build(); 
        
        UserDetails suzan = User.builder()
                .username("suzan")
                .passwrod("{noop}test123")
                .roels("EMPLOYEE", "MANAGER", "ADMIN")
                .build();
        
        return  new InMemoryUserDetailsManager(john, mary, suzan); 
        
    }
}
```