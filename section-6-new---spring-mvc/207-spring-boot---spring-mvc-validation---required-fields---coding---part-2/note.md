## 207. Spring Boot - Spring MVC Validation - Required Fields - Coding - Part 2

#### Add controller code to show HTML form 

```java
@Controller
@RequestMapping("/")
public class CustomerController {
    
    @GetMapping
    public String showForm(Model theModel) {
        
        theModel.addAttribute("customer" , new Customer()); 
        
        return "customer-form"; 
    }
}
```