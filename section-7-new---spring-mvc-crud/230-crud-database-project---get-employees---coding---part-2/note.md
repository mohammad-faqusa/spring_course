## 230. CRUD Database Project - Get Employees - Coding - Part 2

### The process 
1. in `templates`, create new html file `list-employees.html`
2. write the init code of this template 

```html

<body>
    <span th:text="${employees}" />
<!--just to make sure that we can get the data-->

</body>
```
3. run the application, and Success! 
   * but in ugly view 
```json
[Employee{id=1, firstName='Leslie', lastName='Andrews', email='leslie@luv2code.com'}, Employee{id=2, firstName='Emma', lastName='Baumgarten', email='emma@luv2code.com'}, Employee{id=3, firstName='Avani', lastName='Gupta', email='avani@luv2code.com'}, Employee{id=4, firstName='Yuri', lastName='Petrov', email='yuri@luv2code.com'}, Employee{id=5, firstName='Juan', lastName='Vega', email='juan@luv2code.com'}]
```
