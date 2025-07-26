## 181. Spring Boot - Hello World Form and Model - Coding - Part 2
1. go to `HelloWorldController` 
2. before , try to run the application, to view the form `/showFrom`
3. in `HelloWorldController` craete new method 
```java
@RequestMapping("/processForm") 
public String processFrom(){
    
    return "helloworld"; 
}
```
4. in templates, copy the file `helloworld.html`, and rename the previous version `helloworld.backup`
5. remove the css reference, and the body content
```html
<body>
Hello world of spring!
<br><br>

Student name : <span th:text="${parm.studentName}" />
</body>
```
6. run the application 
7. swing to browser `/showFrom`
8. enter your name
9. submit to see your name 