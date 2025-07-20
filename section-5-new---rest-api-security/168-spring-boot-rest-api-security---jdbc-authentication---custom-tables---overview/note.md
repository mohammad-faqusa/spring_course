## 168. Spring Boot REST API Security - JDBC Authentication - Custom Tables - Overview

### Custom Tables 
* for example, tables of `members` and `roles`  
not same as for defautl spring security tables `users` , `authorization`

### Spring schema Customzation 
* Tell spring how to query your custom talbes
* provide query to find user by user name
* provide query to find authorities / roles by user name 

### Developmeent Process
1. Creat eour custom tables with SQL 
2. Update Spring Security Configuration
   * Provide query to find user by user naem
   * provide query to find authorities/ roles by user name 

```java
public class DemoSecurityConfig {
    
    @Bean 
    public UserDetailsManager userDatailsManager(DataSource dataSource) {
        
        theUserDetialManager
                .setUserByUsernameQuery("select user_id, pw, active from members where user_id=?");

        theUserDetialManager
                .setAuthoritiesByUsernameQuery("select user_id, role from members where user_id=?");
        
    }
}
```