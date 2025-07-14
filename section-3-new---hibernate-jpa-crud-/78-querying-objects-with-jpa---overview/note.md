## 78. Querying Objects with JPA - Overview

### JPA CRUD Apps 
* Create
* Read
* Update
* Delete

### JPA Query Language 
* query language for retrieving objects 
* similar in concept to SQL 
  * where, like, order by, join, in, etc ... 
* However, JPQL is based on **entity** name and **entity fields**

### Retrieving all Students 
```java
TypedQuery<Student> theQuery = entityManger.createQuery("FROM Student", Student.class); 
List<Student> students = theQuery.getResultList(); 
```
* `"FROM Student"` is the query 
  * this is not the name of database table 
  * All JPQL syntax is based on **entity name and entity feilds** 

#### Retrieving students: lastName = 'Doe'
```java
TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName='Doe'", Student.class); 
List<Student> students = theQuery.getReusltList(); 
```
#### Retrieving students using OR predicate 
```java
TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName='Doe' OR firstName='Daffy'", Student.class); 
List<Student> students = theQuery.getReusltList(); 
```

#### Retrieving students using LIKE predicate
```java
TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE email LIKE '%luv2code.com'", Student.class); 
List<Student> students = theQuery.getReusltList(); 
```

### JPQL - Named Parameters 
```java
public List<Student> findByLastName(String theLastName) {
    TypedQuery<Student> theQuery = entityManger.createQuery(
            "FROM Student WHERE lastName=:theData", Student.class)
    theQuery.setParameter("theData", theLastName); 
    
    return theQuery.getResultList(); 
}

```
### JPQL - select clause 
* The query examples os far did not specify a "select" clasuse 
* the Hibernate implementation is lenient and allows Hibernate Query Language (HQL)
* For strict JPQL, the "select" clause is required 
```java
TypedQuery<Student> theQuery = entityManager.createQuery("select s FROM Student s", Student.class); 

```
* s is an "identification variable" / alias  
provides a reference to the Student Entity object  
s - Can be any name  
Useful for when you have complex queries 

* Other examples, for strict JPQL 
```java
TypedQuery<Student> theQuery = entityManager.createQuery("select s FROM Student s WHERE s.email LIKE '%luv2code.com' ", Student.class); 

```

### Development Process 
1. Add new method to DAO interface 
  ```java
  public interface StudentDAO {
      //...
    List<Student> findALL(); 
  }
  ```
2. Add new method to DAO implementation 
  ```java
  public interface StudentDAO {
      //...
    @Override 
    List<Student> findALL(){ 
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class); 
        return theQuery.getResultList(); 
    } 
  }
  ```
3. update the main app 
```java
private void queryForStudents(StudentDAO studentDAO) {
    List<Student> theStudents = sutdnetDAO.findAll(); 
    
    // display list of students 
  for(Student tempStudent : theStudents) {
      System.out.println(tempStudent); 
  }
}
```


