## 118. Spring Boot REST DAO - Coding - Part 1

### The process
1. edit IDE settings for auto compiel 
   1. settings : compile : auto 
   2. advances settings : allow auto make to start 
2. edit `application.properties`
```python
#
# JDBC properties
#
spring.datasource.url=jdbc:{postgre url}
spring.datasoruce.username=springstudent
spring.datasource.password=springstudent
```
3. create new package `entity`
4. create class `Employe`
```java
@Entity
@Table(name="employee")
public class Employee {
    // define fieds
   @Id
   @GeneratedValue(strategy = GenerationType.INDENTITY)
   @Column(name="id")
   private int id; 
   
   @Column(name="first_name")
   private String firsName;

   @Column(name="last_name")
   private String lastName;

   @Column(name="email")
   private String email; 
   
   // define constructors 
   
   // empty const
   // 3 parameters const. 
   
   // setters / getters 
   
   // toString() 
}
```