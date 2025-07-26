## 199. Spring Boot - Spring MVC Form Data Binding - Radio Buttons - Coding - Part 2

### Data binding 

### Development Process 

#### Step 1 : Add list of languages to `application.properties` file 
```python
languages=Go,Python,Java,JS
```
#### Step 2 : inject the languages in the StudentController using `@vlaue`
by using `@Value("${languages}")` 
#### Step 3 : add the list of languages to the model 
```java
model.addAttribute("languages", languages); 
```
#### Step 4 : In HTML form, generate list of `<input>` tags for the languages
```html
<input type="radio" th:field="*{favoriteLanguage}"
                    th:each="tempLang : ${languages}"
                    th:value="${tempLang}"
                    th:text="${tempLang}"
```

test and run the application 
