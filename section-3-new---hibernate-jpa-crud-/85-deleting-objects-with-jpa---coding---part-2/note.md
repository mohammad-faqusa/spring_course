## 85. Deleting Objects with JPA - Coding - Part 2

### The process
1. add code `deleteAll` to delete all students 
2. add the method in interface 
3. implement it
```java
public StudentDAOImpl implements StudentDAO {
    
    @Override 
    @Transactional        
    int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
    }
}
```
3. update the main method `deleteAllStudents(studentDAO)`
```java
private void deleteAllStudents(StudentDAO studentDAO) {

    System.out.println("Deleting all students ... ");
    int numOfDeletedStudents = studentDAO.deleteAll();

    System.out.println("the number of deleted students : " + numOfDeletedStudents);
}   

```