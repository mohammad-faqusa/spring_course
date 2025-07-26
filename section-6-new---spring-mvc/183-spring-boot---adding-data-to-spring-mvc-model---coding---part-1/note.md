## 183. Spring Boot - Adding Data to Spring MVC Model - Coding - Part 1

### Code Example 
* We want to create a new method to process form data
* Read the form data: student's name
* Convert the name to upper case
* Add the uppercase version to the model 

1. go to `HelloWorldController`  
add method 
```java
// need a controller method to read form data an 
// add data to the model
@RequestMapping("/processFromVersionTwo")
public String letsShoutDude(HttpServletRequest request, Model model) {
    
    // read the request parameter from the HTML form 
    String theName = request.getParameter("studentName");
    // convert the data to all caps 
    theName = theName.toUpperCase();   
    // creat the message 
    Stirng result = "Yo !" + theName; 
    // add message to the model 
    model.addAttribute("message" , result) ; 
    
    return "helloworld"; 
}
```