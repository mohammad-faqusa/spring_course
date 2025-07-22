## 209. Spring Boot - Spring MVC Validation - Required Fields - Coding - Part 4

#### Step 4 : Perform validation in the Controller class 


in customer controller add post method 

```java
@PostMapping("/processFrom")
public String processFrom(
        @Valid @ModelAttribute("customer") Customer theCustomer,
        BindingResult theBindingResult
) {
    if(theBindingResult.hasErrors()) {
        return "customer-form"; 
    }
    else {
        return "customer-confirmation"; 
    }
}
```