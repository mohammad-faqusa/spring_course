## 141. Spring Boot REST: Spring Data REST Configs and Sorting - Overview

### Spring Data REST, Configuration, Pagination and Sorting

### REST Endpoints 
* By default, spring Data REST will create endpoints based on entity type 
* Simple pluralized form
  * first character of **Enttiy** is lower case
  * then just add `s` to end of entity 

# The english language is very complix
* Spring Data Rest does not handle comple plurzlized forms 

### Solution 
* specify plural name / path with an annotation 
```java
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
    
}
```

### Pagination
* by Default , Spring Data REST will return the first 20 elements 
  * page size = 20
* You can navigate to the different pages of data using query param
  * `localhost:8080/employees?page=0`
  * `localhost:8080/employees?page=1`

### Spring Data REST Configuration 
* Following properties available: `application.properties`

| Name                               | Description                                   |
|------------------------------------|-----------------------------------------------|
| spring.data.rest.base-path         | Base path used to expose repository resources |
| spring.data.rest.default-page-size | Defualt size of pages                         |
| spring.data.rest.max-page-size     | Maximum size of pages                         |
| ...                                | ...                                           |

* then the dependency will just scan `spring.data.rest`

#### Sample Configuration 
```python
spring.data.rest.base-path=/magic-api
spring.data.rest.default-page-size=50 # return 50 element per page
```

### Sorting
* You can sort by the property names of your entity 
  * In our Employee example, we have : **firstName, lastName and email**
* Sort last name (ascending is default)
  * `localhost:8080/employees?sort=lastName`
* sort by first name, descending 
  * `localhost:8080/employees?sort=lastName,desc`
* Sort by last name, then first name, ascending 
  * `localhost:8080/employees?sort=lastName,firstName,asc`

