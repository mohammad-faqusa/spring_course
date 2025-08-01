## 263. Spring MVC Security - Restrict URLs Based on Roles - Coding - Part 2

### The development process 
1. open `DemoContorller` 
```java
// add another request mapping for /leaders
@GetMapping("/leaders")
public String showLeaders() {
    return "leaders" ;
}
```
2. create `leaders.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>luv2code Leaders home Page</title>
</head>
<body>

<hr>
<p>
    See you in Brazil ... for our annual Leadership retrest!
    <br>
    Keep this trip a secret, don't tell the regular employees LOL :-) 
    
</p>

<hr>

<a href="" th:href="@{/}">Back to Home Page</a>
</body>
</html>

```