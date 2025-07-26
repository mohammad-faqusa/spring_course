## 196. Spring Boot - Spring MVC Form Data Binding - Drop-Down Lists - Coding - Part 2

### IN previou video 
* the list of countries are hard coded 
* so we need the list loaded form server 

### Development process
1. add list of countries to application.properties file 
2. inject the countried in the Studentcontroller using @Value 
3. add the list of countries to the model 
4. in HTML form, generate list of <option> tags for the countries 

#### step 1 : add list of countries to application.properties file 
```python
countries=Brazil,France,Palestine,Jordan
```

#### step 2 : inject the countried in the Studentcontroller using @Value 
in student controller 
```java
@Value("${countries}") // inject the countries, from application.properties
private List<String> countries;

// add the list of countries to the model 
public String showForm(Model theModel){
    // ...
    theModel.addAttribute("countries", countries);

}
```

#### Step 4 : in HTML form, generate list of <option> tags for the countries 
1. delete the hard-coded opitons in `select` list 
```html

<option th:each="tempCountry : ${countries}" th:value="${tempCountry}" th:text="${tempCountry}"/>
```