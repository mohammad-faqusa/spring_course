## 222. Spring Boot - Spring MVC Validation - Custom Validation - Coding - Part 1

#### Step 1a: Create @CourseCode annotaiton 

1. craete pakcage 'validation'
2. create class - 'Annotation', `CourseCode`

```java
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode { 
    
}
```
