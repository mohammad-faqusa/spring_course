## 315. @OneToMany: Fetch Types - Eager vs Lazy - Coding

### The process 

1. move to main method 
   1. comment out the called method `createInstructor...`
   2. create method `findInstructorWithCourses...`

```java
private void findInstructorWithCourses(AppDAO appDAO) {
    int theId = 1;
    System.out.println("Finding the instructor with id: " + theId  );
    Instructor theInstructor = appDAO.findInstructorWithCourses(theId);
    
    
    System.out.println("The instructor : " + theInstructor);
    System.out.println("The courses : " + theInstructor.getCourses());
    
    System.out.println("Done!");
}
```
2. run the application 
   * we have exception 
   * `Lazy initialization connection` because the default fetch is lazy
   * change the fetch type to `EAGER`
   * run the application again 
