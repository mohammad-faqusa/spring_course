## 152. Spring Boot REST API Security - Basic Configuration - Overview

### Our Users 
| User Id | Password | Roles                    |
|---------|----------|--------------------------|
| john    | test123  | EMPLOYEE                 |
| mary    | test123  | EMPLOYEE, MANAGER        |
| susan   | test123  | EMPLOYEE, MANAGER, ADMIN |


### Devlopment Process
1. Create Sprign Security Configuration (@Configuration)
2. Add useres, passwrods and roles 

#### Step 1: Create Sprign Security Configuration (@Configuration)
```java
@Configuration
public class DemoSecurityConfig {
    // add our security configuraiton here ... 
}
```
* In Spring Security, passwords are stored using a specific format 
  * `{id}encodedPassword`

| ID     | Description             |
|--------|-------------------------|
| noop   | Plain text passwords    |
| bcrypt | BCrypt password hashing |
| ...    | ...                     |


### Password Example
`{noop}test123`
* noop : the encoding algorithm id  
Lets spring security know hte passwrods are stored as plain text (noop)
* password : test123

#### Step 2: add users, passwords and roles 
```java
@Configuration 
public class DemoSecurityConfig {
    
    @Bean
    public InMemoryUserDeialsManager userDetailsManager() {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails john = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails john = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailManager(john, mary, susan); 
    }
}
```
* We will add DB support in later videos 
