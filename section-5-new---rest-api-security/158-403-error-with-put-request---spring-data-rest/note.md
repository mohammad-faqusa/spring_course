## 158. 403 ERROR with PUT REQUEST - Spring Data REST

### 403 Error - PUT 

* this is a non-issue if using cdoe provided for this lecture `@RestController`
* When using Spring Data REST for PUT requests the ID is on the URL
  * `api/employees{employeeId}`
  * as a result, need to modify the security configuration 

```java
DemoSecurityConfig.java
// Relace 
        .requestMatchers(HttpMethod.PUT, "api/employees").hasRole("MANAGER")
// WITH 
.requestMatchers(HttpMethod.PUT, "api/employees/**").hasRole("MANAGER"); 
```