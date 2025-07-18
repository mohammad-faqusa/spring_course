## 146. Spring Boot REST: OpenAPI and Swagger - Coding - Part 3

### Configure custom path for swagger 
1. in application.propertie s
2. add the configureation 
    ```jupyter
    spring.swagger-ui.path=/api-doc 
    ```
3. save and run the application again 

### View the REST documentation in JSON or YAML format 
1. type on the browswer `http://localhost:8080/v3/api-docs`
2. if you want to view in YAML 
   * type on the browswer `http://localhost:8080/v3/api-docs`
3. 