## 186. Spring Boot - Spring MVC Binding Request Params - Coding

1. in `HelloWorldController`
2. copy `processFormVersionTwo` to `processFormVersionThree`
3. remove the `HttpServletRequest` to `@RequestParam`
```java
@RequestMapping("/processFormVersionThree")
public String processFormVersionThree(
        @RequestParam String studentName
        , Model model) {

    String theName = studentName;
    // read the request parameter from HTML form
    System.out.println(theName);
    // convert data to upper case
    theName = theName.toUpperCase();

    String result = "Yo ~ from version three : " + theName;
    // add the data to model
    model.addAttribute("message", result);

    return "helloworld";

}
```
