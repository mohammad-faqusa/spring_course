## 330. @OneToMany - Uni-Directional - Coding - Update DAO and Main App

#### update the DAO interface 
```java
void save(Course theCourse)
```

#### Implement the method 
```java
@Override 
@Transactional
void save(Course theCourse){
    entityManager.persist(theCourse); 
}
```
* this will save course and associated reviews, becuase of cascade type ALL 

#### Main application 
```java
public CommandLineRunner run(AppDAO theAppDAO){
    runner -> {
        createCourseAndReviews(theAppDAO); 
    }
}

private void createCourseAndReviews(AppDAO theAppDAO){
    Course theCourse = new Course("Socialization with reviews");
    
    // add some reviews 
    theCourse.addReview(new Review("Great course"));
    theCourse.addReview(new Review("Will done"));
    theCourse.addReview(new Review("Bad course"));
    
    // save the course 
    theAppDAO.save(theCourse);
}


```

#### Verify data in database 

### tasks 
1. add instructor
2. add existed courses to instructor 
3. add reviews to the course 
