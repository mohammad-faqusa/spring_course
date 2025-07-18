## 140. Spring Boot REST: Spring Data REST - Coding - Part 2

### Trying the REST enpoints in postman 


### Customize our endpoint base path 
* open `applicaiton.properties`
```python
#
# Spring DATA REST properties 
#
spring.data.rest.base-path=/magic-api
```
* when calling the endpoint : `localhost:8080/magic-api/employees`

#### try REST APIs
1. update `PUT`, use the `id` in body
2. Delete Employee
    * status = 204 , true but no content 

