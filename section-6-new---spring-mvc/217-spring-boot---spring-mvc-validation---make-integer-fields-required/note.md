## 217. Spring Boot - Spring MVC Validation - Make Integer Fields Required

### Do additonal validation of fields

* lets do **required** validation in `freePasses`
* go to `Customer` entity 
```java
@NotNull(message="is required")
@Min(value=0, message="the number should be greater than or equal to 0")
@Max(value=10, message="the number should be less than or equal to 10")
private Integer freePasses;
```
* run the applicaiton 
* use `Integer` instead of premitive 'int' 
* update the getters and setters 
* 