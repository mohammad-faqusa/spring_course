## 67. Setting Up Spring Boot Project - Coding - Part 2

### The process 
1. go to applicaiton properties 
    ```python
    spring.datasource.url=jdbc:postgresql://localhost:5432/student_tracker
    spring.datasource.username=springstudent
    spring.datasource.password=springstudent
    ```
2. try write wrong password  
exception will happen
3. Lets turn off the **Spring boot banner**,  
in application.peroperties  
    ```python
    spring.main.banner-mode=off 
    ```
4. reduce the logging level , in `application.properties` 
```python
# Reduce loggin level. Set loggin level to warn
loggin.level.root=warn
```