# Spring Boot Actuator 


## The Problem : 
* how can I montiro application
* check applicaiton status 
* access metrics 

## The solution : Spring boot Acutator 
* exposes endpoint to monitor and manage your application
* you easily get DevOps functionality out-of-box
* simply add the dependency to your **POM file**
* REST endpoints are automatically added to your application
  * no need to write additional code
  * new REST endpoints free
  * with prefix **/actuator** 
    * /health ...

## Adding the dependency : 
```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
```

## Health Endpoint 
* **/health** check the status of application 
* to if your app is up or down 

## Exposing Endpoints 
* by defualt, only **/health** is exposed 
* The **/info** endpoint can provide information about your application
* to expose **/info** 
  * _File: src/main/resources/application.properties_   
  ```java
        management.endpoint.web.exposure.include=health,info
        management.info.env.enabled=true 
    ```

## Info Endpoint 
* **/info** gives information about your application
* Default is empty 
* Update **application.properties** with app info  
  ```java
        management.endpoint.web.exposure.include=health,info
        management.info.env.enabled=true 
  
        info.app.name= My Super Cool App
        info.app.description=A crazy and fun app, yohoo!
        info.app.version=1.0.0
    ```

## Sptring boot Actuator endpoints 
|name|description|
|-|-|
|/auditevents|Audit Events for your application|
|/beans|List of all beans registered in the Spring application context|
|/mappings|List of all @RequestMapping path|

## Full List of Actuator Endpoints 
by following this link [Full List of Actuator Endpoints](www.lub2code.com/actator-endpoints)

## Exposing Endpoints : 
* by default only **/health** is exposed
* to expose all actuator endpoints over HTTP :  
  ```python
        # User wildcard "*" to expose all endpoints 
        # Can also expose individual endpoints with a comma-delimited list 
    ```
  
## Get A List of Beans: 
* Access **http://localhost:8080/acuator/beans**
* but what about **Security** ?? 


## Development Process : 
1. Edit **pom.xml** and add **spring-boot-starter-actuator
2. View acuator endpoints for : **/health**
3. Edit **application.properties** to customize **/info**

