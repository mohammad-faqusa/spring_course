## 325. @OneToMany - Delete Course

### Delete Course 
* Delete course by ID 

#### Add new DAO method to detele course 
```java
public void deleteCourseById(Long id){
    // delete course by id
    Course course = entityManager.find(Course.class, id);
    
    entityManager.remove(course);
}
```

#### Main app 
`deleteCourse`; 