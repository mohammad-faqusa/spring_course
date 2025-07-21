## 194. Spring Boot - Spring MVC Form Data Binding - Drop-Down Lists - Overview

### Spring MVC Form - Drop Down List 

#### Review of HTML <select> Tag 

```html
<select name="country">
    <option value=""></option>
    <option value=""></option>
</select>
```

#### Thymeleaf and <select> tag

```html
<select th:field="*{country}">
    <option value=""></option>
    <option value=""></option>
</select>
```

### Development process
1. update html form
2. update student class  - add getter / setter for new property 
3. update confirmation page 