## 202. Spring Boot - Spring MVC Form Data Binding - Check Boxes - Coding - Part 2

#### Data Binding 

### the process : 
1.  add to `applicaiton.properties`
2. inject `systems` in `StudentController`
3. pass the `system` in the model 
4. update the HTML form 
```html
<input th:each="tempSystem : ${systems}" th:text="${tempSystem}" th:value="${tempSystem}" th:field="*{favoriteSystems}" /> 
```
5. run the application and checkout 
6. Success !! 

