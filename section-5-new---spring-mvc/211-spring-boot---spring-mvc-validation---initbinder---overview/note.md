## 211. Spring Boot - Spring MVC Validation - @InitBinder - Overview

### White Space 

* Our previous example had a problem with white space 
  * **last name** field with all whitespace passed ... YIKES!
  * Should have **failed** ! 
* we need to trim whitespace from input fields 

#### @InitBinder
* annotation workds as a pre-processor 
* It will pre-process each web request to our controller 
* Method annotated with @InitBinder is executed 

* we will use this to trim Strings 


#### Register Custom Editor in Controller 
```java
@InitBinder
public void initBinder (WebDataBinder dataBinder) {
    StringTrimmerEditor stringTrimmerEditor = new StringtrimmerEditor(true); 
    
    dataBinder.registerCustomerEditor(String.class, stringTrimmerEditor); 
}
```

