## 323. @OneToMany - Update Course
### Update course 
* find a course by id 
* change the courses date by calling setter method 
* update the course using DAO 

#### Add new DAO method to update the course 
```java
public void update(Course theCourse) {
    entityManager.merge(theCourse);
}
```


#### Main app 

```java
private void updateCourse(AppDAO theAppDao) {
    int theId = 1;
    
    System.out.println("Finding course id: " + theId); 
    Course tempCourse = theAppDao.findCourse(theId);
    
    System.out.println("Updating course title"); 
    tempCourse.setTitle("Math and Engineering");
    
    System.out.println("Updating course"); 
    theAppDao.update(tempCourse);
    System.out.println("Done");
}
```

### The process 
1. add the methdo to dao, update the course 
2. implement the method in the app dao impl 
3. call the method in the main app 