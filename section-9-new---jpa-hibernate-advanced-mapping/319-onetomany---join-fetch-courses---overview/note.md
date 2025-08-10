## 319. @OneToMany - JOIN FETCH Courses - Overview

#### Previous Solution: Find courses for instructor 
* previouse solution was OK ... but ... 
* required an extra query 
* I wish we could have a new method that would 
  * get instructor and courses ... in a single query 
  * aslo keep the LAZY option available ... don't change fetch type 

##### Add new method to find instructor with courses
```java
public Instructor findInstructorByJoinFetch(int theId) {
    TypedQuery<Instructor> theQuery = theEntityManager.createQuery(
            "select i from Instructor i" 
            + "JOIN FETCH i.courses " 
            + "where i.id = :data", Instructor.class); 
    theQuery.setParameter("data", theId); 
    return theQuery.getSingleResult();
}
```

* call it in the main method... without writing additional queries 

#### We have two options now : 
* instructor without courses : `findInstructorById`
* instructor and courses : `findInstructorByIdJoinFetch`