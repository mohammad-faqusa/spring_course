## 151. Spring Boot REST API Security - Coding - Part 2

### Enable Spring Security 
* Add maven dependency : `spring-boot-starter-security`
* load the maven changes 

* when running the applicatoin  
defualt username : `user`  
defualt password : **printed on console when starting the application**

* move to browser `localhsot:8080/api/employees`
  * you will see the login page 
  * copy and paste the username and password 

#### Override defualt username and passowrd
1. go to `application.properties` file 
```jupyter
spring.security.user.name=scott
spring.security.user.password=test123
```
2. run the application
3. swing to web browser `http://localhost:8080/api/employee`
4. enther the configured `username` and `password`
5. 

