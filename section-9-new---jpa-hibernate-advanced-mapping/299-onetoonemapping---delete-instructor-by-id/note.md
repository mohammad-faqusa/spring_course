## 299. @OneToOneMapping - Delete Instructor by ID

#### Define DAO implementation 
```java
public class AppDAOImpl implements AppDAO {
    @Override 
    @Transactional
    public void deleteInstructorById(int id) {
        // find the instructor
        Instructor instructor = entityManager.find(Instructor.class, id); 
        
        // delete the instructor 
        entityManager.remove(instructor);
    }
}
```
* this will also delete the instructor detail becuase of the cascade type = all 

### The process
1. open the IDE 
2. open the AppDAO interface and the delete by id method 
3. implement in AppDAOImpl 
4. call it in main application
```java
private void deleteInstructor(AppDAO dao){
    int id = 1;
    System.out.println("Deleting the instructor with id: " + id);
    dao.deleteInstructorById(id);
    System.out.println("Done!");
}
```