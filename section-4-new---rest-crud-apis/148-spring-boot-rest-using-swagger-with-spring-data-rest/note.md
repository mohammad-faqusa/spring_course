## 148. Spring Boot REST: Using Swagger with Spring Data REST

### the common questoin 
1. Can I use OpenAPI and Swagger UI with Spring Data REST ?? 
   * Yes ! 
   * use the same develpment process 

### Develpment Process 
1. add Maven dependdency for spring doc
2. access Swagger UI 
3. Retrieve API endpoints as JSON or YAML 

### The process 
1. move to file system 
2. open the starter project `51-openapi ...` in , downloaded from github 
3. import the project 
4. go to `EmployeeRepository`, wich is built on `Spring Rest Data`
5. move to `application.poroperties`
6. comment out all configured `springdoc`
7. comment out `spring.data.rest.base-path`
8. add dependency `springdoc`
9. sync the maven file 
10. run the application 
11. move to swagger in browser 
12. go to `/v3/api-docs`
    * note that it has `Hatoes` format 
    * you can download the YAML version `/v3/api-docs.yaml`
