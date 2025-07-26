## 215. Spring Boot - Spring MVC Validation - Applying Regular Expressions - Overview

### Regular Expressions 

* A sequence of characters that define a search pattern 
  * This pattern is used to find or match strings 
* Regular expressions is like its own language (advnaced topic)
  * I will assume you already know about regular expressions 
* if not , then plenty of free tutorials avaialbe : 
  * [https://docs.oracle.com/javase/tutorial/essential/regex](https://docs.oracle.com/javase/tutorial/essential/regex)

#### Validate a Postal Code 
* add a new input field on our form for : **Postal Code**
* User can only enter 5 chars / digits 
* Apply regular Expression 

### Development Process
1. Add validation rule to Customer class
2. Display error messages on HTML form 
3. Update confirmation page


#### Step 1 : Add validation rule to Customer class
```java
@Pattern(regexp="", message="only 5 chars/digits")
pirvate String postalCode; 
```