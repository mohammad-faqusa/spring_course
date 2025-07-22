## 212. Spring Boot - Spring MVC Validation - @InitBinder - Coding

#### Add some debug statements for the last name 

* add command to print the last name of recieved customer

* use the trimmer editor : 
```java

public class CustomerController {
    // add an init binder ... to convert trim input strings 
    // remove leading and trailing whitespaces
    // resolve issue for our validation 
    
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(ture); 
        
        dataBinder.registerCustomerEditor(String.class, stringTrimmerEditor); 
        
    }
}
```
* run the application 

