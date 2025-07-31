## 254. Spring MVC Security - Login Form Error Message - Coding

### The process 
1. in the login template , add field to check if error, then show error message
```html

<form action="">
    <div th:if="${param.error}">
        <i>Sorry! You entered invalid username/password.</i>
    </div>
</form>
```
2. run the application 
3. it's up to you to customize the css style 

