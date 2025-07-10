## Resources
[Actuator docs](www.luv2code.com/actuator-docs)

## What About Security? 

* You may **NOT** want to expose all of this information
* Add Spring Security to project and endpoints are secured :-)
* ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    ```

## Secured Enpoints 
* Now ehn you access: **/acuator/beans**
* you should enter the username and password
  * default username: _user_
  * default password: you need to **check the console**  
_Using generated security password_

## Spring Security Configuration
in **_src/main/resources/application.properties_** 
```python
    spring.security.user.name=scott
    spring.security.user.password=tiger
```

## Customizing Spring Security
* You can cusotmize Spring Security for Spring boot Actuator
  * use a database for roles, encrypted passwords, etc..
* We will cover details of Spring Security later in the course

## Excluding Endpoints :
```python
    management.endpoints.web.exposure.exclude=health,info
```

## Development Process 
1. edit the **pom.xml** and add **spring-boot-starter-security**
2. verify the security, by moving to **/beans** in browser
3. exclude endpoints : **/health , /info** 



