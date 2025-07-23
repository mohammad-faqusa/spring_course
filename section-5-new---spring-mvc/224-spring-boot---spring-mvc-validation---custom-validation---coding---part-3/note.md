## 224. Spring Boot - Spring MVC Validation - Custom Validation - Coding - Part 3

#### Step1b: Craeete CourseCodeConstraintValidator 

1. in `validation` package, craete new class `CourseCodeConstraintValidator`
```java

public class CourseCodeConstraintValidator
    implements ConstraintValidator<CourseCode, String> {
    
    pirvate String coursePrefix; 
    
    
    // use the IDE to generated the implemented methods 
    
    // initialize 
    public void initialize(CourseCode theCoruseCode) {
        coursePrefix = theCourseCode.value(); 
    }
    
    // isValid 
    public boolean isValid(Stirng theCode, ContraintValidatorContext contraintValidatorContext) {
        boolean result = theCode.startsWith(coursePrefix); 
        
        return false; 
    }
    
}
```
* `isValid`
  * parameters ; 
    * `theCode` HTML form data entered by the user 
    * `ContraintValidatorContext` You can place additional error messages here 
  * body : 
    * boolean result = theCode.startsWith(coursePrefix)`
      * validation logic 
      * test if the form data starts with our course prefix 
      * does it start with LUV ? 
    * you can add your own custom business logic here 
