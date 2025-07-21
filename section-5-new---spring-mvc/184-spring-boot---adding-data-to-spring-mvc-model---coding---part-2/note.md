## 184. Spring Boot - Adding Data to Spring MVC Model - Coding - Part 2

### The process 

1. go to `hellowolrd` template 

```html
<!DOCTYPE HTML>

<html xmlns:th="http://www.thymeleaf.org">

    <head>
        <title>thymeleaf</title>
    </head>

    <body>
    Hello form spring !
    <br>
    welcome <span th:text="${param.studentName}"/>
    
    <br><br>
    
    The message : <span th:text="${message}"/>
    
    </body>
</html>
```

2. update form to use new request mapping
```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.com">

    <head>
        <meta charset="UTF-8"/>

        <title>Hello world - input form</title>
    </head>

    <body>
        <form th:action="@{/processFormVersionTwo}" method="GET">
            <input type="text" name="studentName" placeholder="What's your name?"/>

            <input type="submit"/>

        </form>
    </body>

</html>
```