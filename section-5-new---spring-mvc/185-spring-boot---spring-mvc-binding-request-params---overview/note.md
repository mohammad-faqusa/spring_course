## 185. Spring Boot - Spring MVC Binding Request Params - Overview

### Reading HTML Form Data with `@RequestParam` annotation 

#### Instead of using HttpServletRequest
```java
@RequestMapping("/processFormVersionTwo")
    public String showFormVersionTwo(HttpServletRequest request, Model model) {

        // read the request parameter from HTML form
        String theName = request.getParameter("studentName");
        System.out.println(theName);
        // convert data to upper case
        theName = theName.toUpperCase();

        String result = "Yo ~" + theName;
        // add the data to model
        model.addAttribute("message", result);

        return "helloworld";
    }
```

#### Bind variable using `@RequestParam` Annotation 
```java
@RequestMapping("/processFormVersionTwo")
public String letsShoutDude(
        @RequestParam("studentName") String theName, 
        Model model) {
    
    
    // now we can use the variable: theName 
}
```

### The process 
1. got to `HelloWorldController`
2. make a copy of `processFormVersionTwo` request 
3. name the new request `processFormVersionThree`, with same method name 
4. delete the `HttpServletRequest` and use `@RequestParam("<anyFieldName>")`
5. change the `form action` in the template, to version 3 
6. run the application 

    