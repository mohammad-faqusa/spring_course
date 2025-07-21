## 195. Spring Boot - Spring MVC Form Data Binding - Drop-Down Lists - Coding - Part 1

#### Step 1: update html form 

```html
Country : 
<select th:field="*{country}">
    <option th:value="palestine">palestine</option>
    <option th:value="jordan">jordan</option>
    <option th:value="yamen">yamen</option>
</select>
```

#### Step 2: update Student class 

```java
private String country;

// setters / getters 
```
#### Step 3: update the confirmation page 
