## 142. Spring Boot REST: Spring Data REST Configs and Sorting - Coding

### The Process
1. stop the running application 
2. open `employeeRepository` 
   * add new annotaiotn

    ```java
    @RepositoryRestResource(path="members")
    public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
        
    }
    ```

   *  try in postman with the new **exposed url** 
3. we will just keep with `employees` path, so comment out the `members` path 
4. to set the defualt page size 
   * go to `application.properties`
   * `spring.data.rest.defualt-page-size=3`
   * you can configure the page size when calling the api
   * `localhost:8080/magic-api/employees?page=0&size=3`
5. sorting data : 
   * `localhost:8080/magic-api/employees?sort=lastName`
   * now try to sort in desc 
   * `localhost:8080/magic-api/employees?sort=lastName,desc`
   * 