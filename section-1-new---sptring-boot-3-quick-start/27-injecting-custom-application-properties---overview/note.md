## Problem 
* You need for your app to be configurable ... no hard-coding of vlaues 
* You need to read app configuration from a properties file 

## Solution 
* by default, Spring Boot reads information from a standard properties file
  * Located at: **src/main/resources/application.properties**
* You can define ANY custom properties in this file
* Your Sptring Boot app can access properties using **@Value**

## Development Process 
1. Define custom properties in **application.properties**
2. Inject properties into Spring Boot application using **@Value**

### Step 1: Define custom application properties 
```python
# 
#Define cusom properties 
#
coach.name=Mickey Mouse
team.name=The Mouse Club
```
### Step 2: Inject properties into Spring Boot app
```java
@RestController
public class FunRestController {
    // inject the properties for : coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    
    @Value("${team.name}")
    private String teamName;
```

