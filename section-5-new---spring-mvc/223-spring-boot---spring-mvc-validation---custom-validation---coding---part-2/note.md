## 223. Spring Boot - Spring MVC Validation - Custom Validation - Coding - Part 2

```java
@Constraint=(validatedBy = CourseCodeConstraintValidation.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    public String value() default "LUV"; 

    // define default error message
    public String message() default "must start with LUV"; 

    // define defualt groups
    public Class<?>[] groups() default {}; 
    
    // define defualt payloads 
    public Class<? extends  Payload>[] payload() default {};


}
```
* `public Class<?>[] groups() default {};` : groups : can group related constraints 
* `public Class<? extends  Payload>[] payload() default {};`
  * provide custom details about validation failure (severity level, error code etc) 

