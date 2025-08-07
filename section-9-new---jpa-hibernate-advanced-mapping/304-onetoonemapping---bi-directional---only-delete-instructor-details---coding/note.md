## 304. @OneToOneMapping - Bi-Directional - Only Delete Instructor Details - Coding


### The process 
1. uncomment the `createInstructor` in the main application 
2. check the database info 
3. lets make the delete only function
instructor detail 
```java
@OneToOne(mappedBy = "instructor", cascade = {
        CascadeType.DETACH,
    CascadeType.MERGE,
    CascadeType.PERSIST,
    CascadeType.REFRESH,
})
private Instructor instructor;
```
4. refactor the `deleteInstructorDetailById`
```java
public void deleteInstructorDetailById(int theId) {
    // retrieve the instructor detail 
    InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, theId);
    
    // break bi directional link 
    instructorDetail.getInstructor().setInstructorDetail(null);
    
    // delete the instructor detail 
    entityManager.remove(instructorDetail);
}
```
5. try the method in the main application 

6. run the application 

7. check the database tables 

