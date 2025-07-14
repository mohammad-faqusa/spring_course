## 81. Updating Objects with JPA - Overview

### Update a Student 
```java
Student theStudent = entityManager.find(Student.class, 1); 

// change first name to "Scooby" 
theStudent.setFirstName("Scooby"); 

entityManger.merge(theStudent); 
```

### Update last name for all student s
```java
int numRowsUpdated = entityManger.createQuery("UPDATE Student SET lastName='Tester'").executeUpdate(); 
```

### Development Process 
1. add new methdo to interface and implementation 
```java
@Override
@Transactional
public void update(Student student) {
    entityManager.merge(theStudent); 
}
```
2. update main app
   1. define method `updateStudent(StudentDAO studentDAO)`
