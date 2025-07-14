## 76. Reading Objects with JPA - Overview

### Retrieving an Object

## JPA CRUD Apps 
* Create objects
* Read objects 
* Update objects
* Delete objects
now we will focus on **Read** objects 

### Retrieving a Java Object with JPA 
```java

// retrieve/read form database using the primary key
// in this example, retrieve Student with primary key: 1

Student myStudent = entityManager.find(Student.class, 1);
```
* **Student.class** is the Entity class
* **1** is the primary key 
* if not found, returns **null** 

### Development Process
1. Add new method to DAO interface
2. Add new method to DAO implementation 
3. Update main app 

#### Step 1: Add new method to DAO interface 
```java
public interface StudentDAO {
    
    Student findById(Integer id) ; 
}
```

#### Step 2: Define DAO implementation 
```java
public class StudentDAOImpl implements StudentDAO {
    
    private EntityManager entityManger; 
    
    @Override 
    public Student findById(Integer id) {
        return enitityManager.find(Student.class, id); 
    }
}
```
* No need to add **@Transactional** since we are doing a query 

#### Step 3: Update main app
```java
private void readStudent(StudentDAO studentDAO) {
    Student tempStudent = new Student("Daffy", "Duck", "d@gmail.com");
    studentDAO.save(tempStudent); 
    
    Student myStudent = studentDAO.findById(tempStudent.getId()); 
}
```