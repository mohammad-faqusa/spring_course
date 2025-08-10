## 317. @OneToMany: Lazy Find Courses - Coding - Part 1

### The process
1. change the fetch type to lazy in `instructor`
2. add the method to `AppDAO` , `findCoursesByCustomerId`
3. implement the method 
```java

public List<Cours> findCoursesByCustomerId(int theId) {
    
    TypedQuery<Course> query = entityManager.createQuery("from Course where instructor.id = :data", Course.class);
    query.setParameter("data", theId);
    
    // execute the query 
    List<Course> result = query.getResultList();
    
    return result;
}
```