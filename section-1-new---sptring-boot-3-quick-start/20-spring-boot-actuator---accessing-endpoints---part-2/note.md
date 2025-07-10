## Resources 
* [the solution code](https://github.com/darbyluv2code/spring-boot-3-spring-6-hibernate-for-beginners/tree/main/01-spring-boot-overview/03-actuator-demo)

## Continue the process - Part 2
1. in **application.properties**  
    ```python
   management.endpoints.web.exposure.include=health,info
   management.info.env.enabled=true
   
   info.app.name=My Super Cool App
   info.app.description=A crazy fun app, yoohoo!
   info.app.version=1.0.0
    ```
2. save it , and run it , to move browser **/actuator/info**
3. expose more actuator endpoints !  
    ```python
   # we can use "*" to expose all endpoints
   # also expose individual enpoints with a comma-delimited list
   management.endpoints.web.exposure.include=health,info
   management.info.env.enabled=true
   
   info.app.name=My Super Cool App
   info.app.description=A crazy fun app, yoohoo!
   info.app.version=1.0.0
    ```
4. Let's test this out, by running **/acuator/beans** in browser

