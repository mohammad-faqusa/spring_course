## 298. @OneToOneMapping - Find Instructor by ID

#### Define DAO implementation 
```java
public class AppDAOImpl implements AppDAO {
    
    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class, id); 
    }
}
```
* `return entityManager.find(Instructor.class, id);` 
  * this will also retrieve the instructor details object 
  * becuase of the default behavior of @OneToOne fetch type is **EAGER** ... more on fetch types later 

### Lets write some code 
1. update the AppDAO interface to find the instructor by id 
```java
Instructor findInstructorById(int id);
```
2. add the method to AppDAOImpl
```java

@Override 
public Instructor findInstructorById(int theId) {
    return entityManger.find(Instructor.class, theId); 
}
```
3. move to main application to call this method 

```java
public CommandLineRunner run(AppDAO appDAO) {
    return runner -> {
        findInstructor(appDAO);
    };
}

private void findInstructor(AppDAO appDAO) {
    int theId = 1;
    sout("Finding instructor by id: " + theId);
    Instructor theInstructor = appDAO.findInstructorById(theId);
    System.out.println("the instructor : " + theInstructor);
    sout("the associated instructor detail only : " + theInstructor.getInstructorDetails());
}
```
