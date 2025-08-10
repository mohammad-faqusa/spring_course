## 322. @OneToMany - Update Instructor

### Update Instructor 
* find the instructor by id 
* change the instructor's data calling setters methods 
* update the instructor using the dao 

#### Add new DAO method to update instructor 
```java
@Override 
@Transactional 
public void update(Instructor tempInstructor) {
    entityManager.merge(tempInstructor);
}
```

#### call the update method in main method 
```java
public void updateInstructor(AppDAO appDAO) {
    
    int theId = 1; 
    
    Instructor tempInstructor = appDAO.getInstructor(theId); 
    tempInstructor.setFirstName("Jane"); 
    tempInstructor.setLastName("Doe"); 
   
    appDAO.update(tempInstructor);
    
    System.out.println("Instructor updated successfully!");
}
```

### Move to the IDE
1. add the method to DAO interface 
2. implement the method 
3. call in the main application , call the method : `updateInstructor`
4. run the application, and check the updated data in pgAdmin 

