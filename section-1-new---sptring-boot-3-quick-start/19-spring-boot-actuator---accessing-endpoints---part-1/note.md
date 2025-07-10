
# Actator Example Process 

## Info endpoint process : 
1. move to IDE 
2. if spring running, stop it
3. it is recommended to house keeping the projces (copy and pace)
4. edit the maven **pom.xml** file 
5. copy the dependency with edited artifact _spring-boot-starter-actuator-
6. press on maven icon to update
7. to expose **/info** go to application.properties
8. by writing these commands :  
   ```python
   management.endpoints.web.exposure.include=health,info
   management.info.env.enabled=true
    ```
9. try it by running the application
10. to investigate the process : 
    1. expand running monitor : 
    2. you will notice : Exposing 2 endpoint(s) beneath base path '/actuator'
11. go to check in web browser :  
localhost:8080/actuator/health  
localhost:8080/actuator/info (empty, need to be customized)