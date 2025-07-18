## 147. Spring Boot REST: OpenAPI and Swagger - Coding - Part 4

### The process 


#### Configure the custom path for `/api-docs`
1. move to `application.properties`
```jupyter
springdoc.api-docs.path=/my-api-docs
```
2. run the application again 
3. move to the configured url `localhost:8080/my-api-docs`
4. you can 2use the same url for YAML format : `localhost:8080/my-api-docs.yaml` 
5. lets reset everything to default, **comment out all our customized configurations**

