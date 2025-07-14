## 80. Querying Objects with JPA - Coding - Part 2

### Find a student by their last name 

1. add the method `findByLastName(String theLastName)` to interface
2. override on implementation 
```java
public List<Student> findByLastName(String theLastName) {
    
    // create query 
    TypedQuery<Student> theQuery = entityManger.createQuery("FROM Student WHERE lastName=:theData", Student.class);
    // set the query parameter 
    theQuery.setParameter("theData", theLastName);
    // return the query result
    return theQuery.getResultList(); 
}
```
3. swing to main application  
add new method `queryForStudentsByLastName(studentDAO)`  
   * get a list of students 
   * display list of students 
4. run the application and test 

