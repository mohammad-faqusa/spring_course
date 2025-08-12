## 331. @OneToMany - Uni-Directional - Coding - Retrieve Course and Reviews

### The process
1. open the `appDAO` interface 
```java

Course findCourseAndReviewsByCourseId(int theId); 
```
2. dao implementation
```java
// create query 
TypedQuery<Course> query = entityManager.createQuery(
        "select c from Course c "
                + "JOIN FETCH c.reviews "
                +"where c.id = :data", Course.class
        );
query.setParameter("data", theId); 

// execute query 
Course course = query.getSingleResult(); 

return course;

```

3. in main application , add method `retrieveCourseAndReviews`
```java
return runner -> {
    retrieveCourseAndReviews(appDAO); 
}
        
void retrieveCourseAndReviews(AppDAO appDAO) {
    // get the course and reviews 
    int theId = 10; 
    Course tempCourse = appDAO.findCourseAndReviewsByCourseId(theId); 
    
    // print the course 
    System.out.println(tempCourse); 
    
    // print the reviews 
    System.out.println(tempCourse.getReviews());
    
    System.out.println("Done!"); 
}
```
