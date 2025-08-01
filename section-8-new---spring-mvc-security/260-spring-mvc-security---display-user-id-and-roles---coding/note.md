## 260. Spring MVC Security - Display User ID and Roles - Coding

#### Step 1: Display the User ID : 
```html

<html xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
<hr>
<!--display username and role -->

<p>
    User : <span sec:authentication="principal.username"></span>

    <br><br>
    
    Roles(s): <span sec:authentication="principal.authorities"></span>
</p>
</html>

```

* run the application to test 
* login for `john`
* login for `mary`
* login for `suzan`

