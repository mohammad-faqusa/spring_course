## 177. Spring Boot - Spring MVC with Thymeleaf and CSS - Coding
1. go to static 
2. create css file `demo.css`
```css
.funny {
    font-size: italic;
    color: green; 
}
```

```html
<html>
<head>
    <link href="stylesheet" th:href="@{css/demo.css}"/>
</head>
<body>
    <p th:text="Time on the server is ' + ${theDate}" class="funny" />
</body>
</html>
```