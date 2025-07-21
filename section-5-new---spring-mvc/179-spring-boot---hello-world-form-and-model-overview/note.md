## 179. Spring Boot - Hello World Form and Model Overview

### High level view 
in this exercise : 

* the user fill the form, with his name
* then sumpit the page to server 
* the server response with stored name of user


* we have to requests 
```java
@Controller
public class HelloWorldController {
    
    // need a controller method to show the initial HTML form 
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
    
    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld"; 
    }
}
```

### Development Process
1. Create Controller class 
2. Show HTML form 
   1. Create controller method to show HTML form
   2. Create view page for HTML form 
3. Process HTML form 
   1. Create method to process HTML form
   2. Develop View page for Confirmation 
