## 221. Spring Boot - Spring MVC Validation - Custom Validation - Overview - Part 2

#### Step 1 : Create `@CourseCode` annotation 

usage example 
when calling : 
```java
@CourseCode(value, message)
pirvate string coursCdoe
```

```java
Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({Element.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode { 
    
}
```
* `CourseCodeConstraintValidator` helper class that contains business rules / validation logic 
* `@Target({Element.METHOD, ElementType.FIELD})` 
  * can apply our annotation to a method or field 
* `@Retention(RetentionPolicy.RUNTIME)`
  * Reain this annotation in the java class file 
  * process it at runtime 
  * (RUNTIME), simply keep the annotation in java byte code so we can use it in runtime 
* we have setup some parameters : `@CourseCode(value="LUV", message="must start with LUV)`


```java
Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({Element.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode { 
    
    // define default course code 
    public String value() default "LUV"; 
    
    // define defualt error message 
    public String message() default "must start with LUV";
}
```

##### Step 1b: Create CourseCodeConstraintValidator 
```java

public class CourseCodeConstraintValidator 
    implements ConstraintValidator<CourseCode, String> { // courseCode : our annotation, String: type of data  to validatoe against 
    
    private String coursePrefix; 
    
    public initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value(); 
    }
    
    @Override
    public boolean isValid(String theCode, 
                           ConstraintValidationContenxt theConstraintValidatorContext) {
        boolean result;
        
        if(theCode!=null) {
            result=theCode.startsWith(coursePrefix);
            
        } else {
            result = true; 
        }
        
        return result; 
    }
}
```
* `coursePrefix = theCourseCode.value(); `, the value is passed in value parameter: `@CourseCode(value, message)`
* `result = true; ` the course code is not a required field 

