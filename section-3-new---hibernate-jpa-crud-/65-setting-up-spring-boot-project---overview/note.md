## 65. Setting Up Spring Boot Project - Overview

### Automatic Data Source Configuration
* In Spring Boot, Hibernate is the default implementation of JPA
* **EntityManager** is main component for craeting queries etc ...
* **EntityManager** is from Jakarta Persistence API (JPA)
* Based on configs, Spring Boot will automatically create the beans: 
  * DataSouruce, EnitityManager 
* You can then inject into your app, for example your DAO

### Setting up Project with Spring Initializer 
* At Spring Initializer website , [start.spring.io](start.spring.io)
* Add dependencies 
  * Postgres driver
  * Spring data JPA 
* Spring will **automatically configure** you data source for you 
* Based on entries Maven pom file 
  * JDBC Driver: `postgresql`
  * Spring Data (ORM) : `spring-boot-starter-data-jpa`
* DB connection info from `application.properties`
    ```pytthon
    # ---- PostgreSQL connection ----
    spring.datasource.url=jdbc:postgresql://localhost:5432/student_tracker
    spring.datasource.username=springstudent
    spring.datasource.password=springstudent
    ```
* **note** : No need to give JDBC driver class naem,  
Spring Boot will automatically detect it based on URL 

### Creating Spring Boot - Command Line APP 
* We will create a Spring Boot - Command Line App
* This will allow us to focus on Hibernate / JPA
* Later in the course, we will apply this to a `CRUD REST API`

```java
@SpringBootApplication {
    public static void main(String [] args){
        SpringApplication.run(CruddemoApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(String[] args) {
        return runner -> {
            System.out.println("Hello world");
        }
    }
}
```