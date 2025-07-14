## 79. Querying Objects with JPA - Coding - Part 1

### The Process 
1. update the interface `findAll()`; 
2. override the method in implemented DAO 
```java
public List<Student> findAll() {
    // create query
    TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class); 
    
    // return query results 
    return theQuery.getResultList(); 
}
```
3. update the main application  
    ```java
    private void queryForStudents(StudentDAO studentDAO) {
        // get a list of students
        
        List<Student> students = studentDAO.findAll(); 
        
        // display  list of students 
        for(Student tempStudent : students) {
            System.out.println(tempStudent);
        }
    }
    ```
4. run the application 
5. compare the result to postgre admin 
6. lets do some **enhacement** on the query  
"FROM Student order by lastName asc"


