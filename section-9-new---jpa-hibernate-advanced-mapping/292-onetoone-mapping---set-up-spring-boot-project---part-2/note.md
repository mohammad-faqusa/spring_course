## 292. @OneToOne Mapping - Set up Spring Boot Project - Part 2

### The porcess : 
1. edit the application properties 
```properties
spring.application.name=cruddemo
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_database
spring.datasource.username=postgres
spring.datasource.password=1234

# Turn off the Spring boot banner 
spring.main.banner-mode=off

# Reduce logging level. Set logging level to warn 
logging.level.root=warn

```
2. run the application 
   * database connection successful 
   * Hello world 
3. Let's turn of f the String boot banner 
```properties
# Turn off the Spring boot banner 
spring.main.banner-mode=off

# Reduce logging level. Set logging level to warn 
logging.level.root=warn
```
