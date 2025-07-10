## Spring Boot Properties 
* Spring Boot can be configured in the **application.properties** file
* Server port, context path, acuator, security etc.. 
* Spring Boot has 1,000+ properties ... wowzers
* The properties are roughly grouped into the following **catagories**
  * core 
  * web
  * security
  * data
  * actuator
  * integration
  * dev toosl
  * testing
* we will use some of the properties

## [List of Common Properties](www.lub2code.com/spring-boot-props)

## Properties :
## Core Properties
File: _src/main/resources/application.properties_  
  ```python
  # Log levels severity mappings
  logging.level.org.springframework=DEBUG
  logging.level.org.hibernate=TRACE
  logging.level.com.luv2code=INFO
  ```  
  set logging levels based on package names  
loggin levels :  
  * Trace
  * Debug
  * INFO
  * WARN
  * ERROR
  * FATAL
  * OFF  
  
### [spring boot loggin](www.lub2code.com/spring-boot-logging)

## Web Properties
File: _src/main/resources/application.properties_  
```python
#HTTP server port
server.port=7070

#Context path of the application
server.servlet.context-path=/my-silly-app

#Defualt HTTP session time out
server.servlet.session.timeout=15m
```

## Acuator Properties 
File: _src/main/resources/application.properties_  
```python
#Endpoints to include by naem or wildcard
management.endpoints.web.exposure.include=*

#Endpoints to exclude by name or wildcard
management.encpoints.web.exposure.exclude=beans,mapping

#Base path for actuator endpoints
management.endpoints.web.base-path=/acuator
```
## Security Properties
File: _src/main/resources/application.properties_
```python
# Defualt user name
spring.security.user.name=admin

# Password for default user
spring.security.user.password=topsecret
```

## Data Properties
File: _src/main/resources/application.properties_
```python
# JDBC URL of the database
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce

# Login username of the database
spring.datasource.username-scott

# Login password of the database
spring.datasource.password=tiger
```

## [Spring Boot Properties](www.luv2code.com/spring-boot-props)


## Development Process 
1. Configure the server port
2. Configure the application context path 

