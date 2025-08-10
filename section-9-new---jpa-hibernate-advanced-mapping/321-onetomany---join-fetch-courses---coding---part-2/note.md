## 321. @OneToMany - JOIN FETCH Courses - Coding - Part 2

### The process 
1. in main application, write the method `findInstructorIdWithJoinFetch`
2. add the `InstructorDetail` to join fetch
    * back to dao impl 
```java
        TypedQuery<Instructor> query = entityManger.createQuery("select  i from Instructor i join fetch i.courses join fetch i.instructorDetail where i.id=:data", Instructor.class);
```
3. run the application , and look at the generated SQL in console 
