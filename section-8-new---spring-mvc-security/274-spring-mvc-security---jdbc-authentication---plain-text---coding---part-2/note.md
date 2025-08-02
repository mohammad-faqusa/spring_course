## 274. Spring MVC Security - JDBC Authentication - Plain Text - Coding - Part 2

#### Step 1: add some maven dependencies 

```xml
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>

```

* load the maven changes 

#### update the `applicatoin.properties`
```properties
spring.datasource.url=jdbc:postgre://localhost:5432/employee_database
spring.datasource.username=postgre  
spring.datasource.password=1234

# 
# Log JDBC SQL statements 
# 
# Only use this for dev/testing 
# Do NOT use for PRODUCTION since it will log user names 

logging.level.org.springframework.jdbc.core=TRACE

```