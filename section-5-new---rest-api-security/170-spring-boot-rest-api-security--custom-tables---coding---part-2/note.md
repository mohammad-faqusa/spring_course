## 170. Spring Boot REST API Security -Custom Tables - Coding - Part 2
1. in the project, go to `config`, `securityDemo...`
2. refactor
```java
@Bean
public UserDetailsManager userDetailsManager(DataSource dataSource) {
    
    JdbcUserDetailsManager jdbcUserDetialsManager = new JdbcUserDetailsManager(dataSource); 
    
    // define query to retrieve a suer by username
    jdbcUserDetialsManager.setUsersByUsernameQuery(
            "select user_id, pw, active from members wherer user_id=?"
    );
    // define query to retrive the authorized/rlles by username 
    jdbcUserDetialsManager.setAuthoritiesByUsernameQuery(
            "select user_id, roles from roles where user_id=?"
    ); 
    return jdbcUserDetialsManager;
}
```
3. run the applicaiton, and test it out 
