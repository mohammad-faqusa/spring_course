## 198. Spring Boot - Spring MVC Form Data Binding - Radio Buttons - Coding - Part 1

#### 1. Update HTML form
```html
<br><br>
Favorite Programming Language 
<input type="radio" th:field="*{favoriteLanguage}" th:value="Go">Go<input/>
<input type="radio" th:field="*{favoriteLanguage}" th:value="Java">Java<input/>
<input type="radio" th:field="*{favoriteLanguage}" th:value="python">python<input/>
```
#### 2. Update Student class - add getter/setter for new property
```java
private String favoriteLanguage; 

// getteres/setters 
```

#### 3. Update confirmation page 
<span th:text="${student.favoriteLanguage}" 