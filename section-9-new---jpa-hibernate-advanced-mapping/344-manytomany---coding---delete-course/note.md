## 344. @ManyToMany - Coding - Delete Course

#### Only delete the course-Student relationship 

### The process
1. add the method in main app 
```java
void deleteCourse(AppDAO theAppDAO) {
    
    int theId = 10;

    System.out.println("Deleting the course with id : " + theId);
    
    // delete the course by id 
    theAppDaO.deleteCourseById(theId); 
}
```
* when running the application process : 
  * success
  * remove association 
  * delete the course where id=? 