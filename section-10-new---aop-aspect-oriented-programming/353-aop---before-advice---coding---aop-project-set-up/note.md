## 353. AOP - @Before Advice - Coding - AOP Project Set Up

### The process 
1. spring initializer 
   1. group : `com.luv2code`
   2. artifactId : `aopdemo`
   3. no dependecy to add 
2. download the initializer , to name `01-spring-boot-aop-demo`
3. copy and paste in section `10-spring-boot-aop`
4. open the project in IDE 
5. add dependency for Spring boot AOP starter  
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```
6. Modify logging in `application.properties`
```properties
# Turn off the Spring Boot banner 
spring.main.banner-mode=off 

# Reduce the loggin level. Set logging level to warn 
logging.level.root=warn 


```
7. open the main application 
```java
CommandLineRunner commandLineRunner(String [] ages) {
    
    runner -> {

        System.out.println("Hello world");
    }
}
```

