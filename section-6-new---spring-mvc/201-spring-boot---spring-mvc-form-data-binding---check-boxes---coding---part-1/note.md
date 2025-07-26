## 201. Spring Boot - Spring MVC Form Data Binding - Check Boxes - Coding - Part 1

#### Step 1 : update HTML form 
```html

<br><br>
Select Favorite Operating Systems 
<input type="checkbox" 
       th:field="*{favoriteSystems}"
       th:value="Linux">Linux<input/>
<input type="checkbox"
       th:field="*{favoriteSystems}"
       th:value="Mac">Mac<input/>
<input type="checkbox"
       th:field="*{favoriteSystems}"
       th:value="'Microsoft Windows'">Microsoft Windows<input/>
```

#### Step 2 : add the property to student class 
```java
private List<String> favoriteSystems; 

// getters / setters 


```

#### Step 3 : update confirmation page 
```html
<br><br>
Favorite Systems : <span th:text="${student.favoriteSystems}" />
```

run and test the application 

**note** when displaying the list, it is in toString method 

#### display the list in listed points in html 
```html
<br><br>
Favorite Systems : <span th:text="${student.favoriteSystems}" />
<ul>
    <li th:each="tempSystem : ${student.favoriteSystems}" th:text="${tempSystem}"/>
</ul>
```

**run the application again** 

