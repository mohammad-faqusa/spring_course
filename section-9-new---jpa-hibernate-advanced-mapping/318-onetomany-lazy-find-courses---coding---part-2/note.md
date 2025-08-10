## 318. @OneToMany: Lazy Find Courses - Coding - Part 2

#### Make use of the dao method in main method 

```java
private void findCoursesForInstructor(AppDAO theAppDAO) {

    int theId = 1;
    System.out.println("Find instructor by id: " + theId);
    Instructor theInstructor = theAppDAO.findInstructorById(theId);
    System.out.println("Found instructor: " + theInstructor);
    
    List<Course> theCourses = theAppDAO.findCoursesForInstructor(theInstructor);

    System.out.println("Found courses: " + theCourses);

    System.out.println("Done!");
}
```
2. run the application