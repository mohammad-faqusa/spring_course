## 86. Create Database Tables from Java Code - Overview

### Create Database talbes : student 
* Previously, we created database tables by running a SQL script 
* another option, provided from the **JPA** 
  * creates based on java code 
  * useful for development and testing 

### Configuration 
* in **application.properties**
```python
spring.jpa.hibernate.ddl-auto=create
```
* When you run your app, JPA/HIbernate will **drop** tables then create them 
* Based on the JPA/Hibernate annotations in your java code 

### Creating Tables based on Java code 
```java
package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    // constructors , getters/setters 
}
```

### Configuration - applicatoin.properties 
| property value | property description                                                                                            |
|----------------|-----------------------------------------------------------------------------------------------------------------|
| none           | no action will be performed                                                                                     |
| create         | Database tables are fropped followed by database tables creation                                                |
| create-drop    | database tables are followed by database tables creation.<br/> On application shutdown, drop the database tables |
| validate       | validate the database tables schema                                                                             |
| update         | Update the database tables schema                                                                               |

### Basic Projects 
* for basic prpjects, can use auto configuration 
```python
spring.jpa.hibernate.ddl-auto=create
```
* Database tables are **dropped** first and then **created** from scratch
* If you want to create tables once ... and then keep data, use: **update** 
```python
spring.jpa.hibernate.ddl-auto=update
```
* However, will `ALTER` database schema based on lastest code updates 
* be VERY careful here ... only use for basic projects 

### Warning 
```python
spring.jpa.hibernate.ddl-auto=create
```
* Don't do this on **Production** databases!!!
* You don't want to **drop** your Production data
  * All data is deleted!!! 
* Instead for Production, you should have DBAs run SQL scripts 

### Use Case
```python
spring.jpa.hibernate.ddl-auto=create
```
* Automatic talbe generation is useful for : 
  * Database integration testing with in-memory databases
  * Basic, small hobby projects

### Recommendation 
* In general, I don't recommend auto generation for etnerprise, real-time projects
  * You can VERY easily drop PRODUCTION data if you are not careful 
* I recommend use SQL scripts 
  * Corporate DBAs prefer SQL scripts for governance and code review 
  * The SQL scripts can be customized and fine-tuned for complex database designs 
  * The SQL scripts can be **version-controlled**
  * Can also work wtih schema migration tools such as Liquibase and Flyway
