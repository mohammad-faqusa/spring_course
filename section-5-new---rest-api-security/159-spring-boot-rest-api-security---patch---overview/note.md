## 159. Spring Boot REST API Security - PATCH - Overview

### Restric Access based on roles 

#### Our example 

PATCH request is only available for manager 

`requestMathcer(HttpMethod.PUT, "api/employees/**").hasRole("MANAGER")`

