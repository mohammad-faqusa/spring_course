## 282. Spring MVC Security - JDBC Authentication - Custom Tables - Coding - Part 2

#### Update Spring Security Configuration to use custom talbes 

```java
@Bean
public UserDetailsManager userDetailsManager(DataSource dataSource) {

    JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

    // define query to retrieve a user by username 
    jdbcUserDetailsManager.setUsersByUsernameQuery(
            "select user_id, pw, active from members where user_id=?"
    );
    
    // define query to retrieve the authorities by username 
    jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
            "select user_id, role from roles where user_id=?"
    );
    
    return jdbcUserDetailsManager;
}

```
* refactor -> introduce variable 

* run the application, and try to login 
* we configured spring security to use our custom database tables 
* custom table names and column names 

