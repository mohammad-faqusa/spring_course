## 163. Spring Boot REST API Security - JDBC Authentication - Plain Text - Coding Part 2

### Update Spring Security Config to use JDBC 
1. move to `security` -> `config`
2. comment out the code, with hardcoded users 
```java
// add support for JDBC ... no more hardcoded users 

@Bean
public UserdetailesManager userDetialsManager(DataSource dataSource) {
    
    return new JdbcUserDetailsManager(dataSource); 
}
```
3. run the application and test it out 
4. 