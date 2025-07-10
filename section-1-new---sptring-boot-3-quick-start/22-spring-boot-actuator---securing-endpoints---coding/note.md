## Resources
[code solution](https://github.com/darbyluv2code/spring-boot-3-spring-6-hibernate-for-beginners/tree/main/01-spring-boot-overview/04-actuator-security-demo)

## Process 
1. for house HouseKeeping work 
   1. Close project window
   2. copy project folders
   3. name the folder : '04-actuator-security-demo'
2. edit **pom.xml** to add the dependency  
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    ```  
   by adding this dependency, automatically secure REST endpoints
3. laod maven changes 
4. Run the application
5. the generated password is generated in **the console**
6. try to access **/acuator/mappings**  
it is secured with login   
enter user : _user_, password : _generated password in console_
8. disable endpoints **/health , /info**  
`management.endpoints.web.exposure.exclude=health,info`  
so when accessing these end points in browser you will get 404  
comment out the command, these enpoints are useful
