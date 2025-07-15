## 83. Deleting Objects with JPA - Overview

### Delete Student 
```java
// retrieve the student 
int id = 1; 
Student student = entityManager.find(Student.class, id); 
// delete the student 
entityManager.remove(student); 
```
### Delete based on a condition 
```java
int numRowsDeleted = entityManager.createQuery(
        "DELETE FROM Student WHERE lastName='Smith'"
        ).executeUpdate(); 
```
* `executeUpdate()`, why use Update instead of remove or update ? 
  * the method update is generic term  
  meaning : modifying the database 

### Delete All Students 
```java
int numOfRows = entityManger
        .createQuery("DELETE FROM Student")
        .executeUpdate(); 
```

### Development Process
1. Add new mthod to DAO interface 
```java
public interface StudentDAO {
    void delete(Integer id); 
}
```
2. Add new method to implementation 
```java
public class StudentDAOImple implements StudentDAO {
    @Override 
    @Transactional
    void delete(Integer id){
        Student theStudent = entityManager.find(Student.class, id); 
        entityManager.remove(theStudent);
    }
}
```
3. update the main app 
```java
public void deleteStudent(StudentDAO studentDAO) {
    int studentId = 3 ;
    System.out.println("deleteing student with id : " + studentId)
    studentDAO.delete(studentId); 
}
```a

