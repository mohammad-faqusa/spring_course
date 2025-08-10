## 316. @OneToMany: Lazy Find Courses - Overview

#### Previous solution : EAger 
* Eager will retrieve everything. .. all of the courses for an instructor
* but we may not want this all of the time 
* we'd like option to laod what needed 


#### Fetch Type 
* change the fetch type back to lazy 
```java
public class Instructor {
OneToMany(fetch = FetchType.LAZY)
private List<Course> courses;
}
```


#### Add enw method to find courses for instructor 
in dao impl : 
```java
@Override
public List<Course> findCoursesByInstructorId(int theId) {
    
    // create query
    TypedQuery<Course> query = em.createQuery("from Course where instructor.id = :data", Course.class);
    query.setParameter("data", theId);
    
    // execute query
    List<Course> courses = query.getResultList();
}
```

in the main method : 
```java
private void findInstructorWithCourse(AppDAO theAppDAO) {

        int theId = 1;
        System.out.println("Find instructor by id: " + theId);
        Instructor theInstructor = theAppDAO.findInstructorById(theId);
        System.out.println("Found instructor: " + theInstructor);
        
        List<Course> theCourses = theAppDAO.findCoursesByInstructorId(theId);
        System.out.println("Found courses: " + theCourses);
        System.out.println("Done!");
}
```
* the instructor is fetched as lazy, but what about courses ? 
* 