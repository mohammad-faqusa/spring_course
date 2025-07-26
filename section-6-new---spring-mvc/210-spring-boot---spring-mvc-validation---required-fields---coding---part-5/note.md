## 210. Spring Boot - Spring MVC Validation - Required Fields - Coding - Part 5

#### Step 5 : create the confirmation page 

in templates , create `customer-confirmation.html`

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Customer Confirmation</title>
</head>
<body>

The customer is confirmed : <span th:text="${customer.firstName} + '  ' + customer.lastName"

</body>
</html>

```

now lets run the application 

but if we pass **spaces** in required field, it will **pass** !!! 