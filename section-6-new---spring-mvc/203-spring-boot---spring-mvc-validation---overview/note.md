## 203. Spring Boot - Spring MVC Validation - Overview

### The need for validation 
check th user input form for : 
* required fields 
* valid numbers in a range 
* valid format (postal code)
* custom business rule 

### Java's Standard Bean Validation API 
* Java has a standard Bean Validation API 
* Defines a metadata model and API for entity validation 
* Spring Boot and Thymeleaf also support the Bean Validation API 
* [http://www.beanvalidation.org](http://www.beanvalidation.org)

### Validation Annotations 
| Annotation      | Description                                  |
|-----------------|----------------------------------------------|
| @NotNull        | Checks that the annotated value is not null  |
| @Min            | Must be a number >= value                    |
| @Max            | Must be a number <= value                    |
| @Szie           | Size must match teh given size               |
| @Pattern        | Must match a regular expression pattern      |
| @Future / @Past | Data must be in future or past of given data |
| others ...      |                                              |

### Our Road Map 
1. set up our developement environment 
2. required field 
3. validate number range: min, max
4. validate using regular expression (regexp)
5. custom validation 

