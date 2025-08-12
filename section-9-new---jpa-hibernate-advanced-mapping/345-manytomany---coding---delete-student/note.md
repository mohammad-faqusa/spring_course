## 345. @ManyToMany - Coding - Delete Student

### The process 
1. add new method in dao interface  
```java
void deleteStudentById(int theId); 
```
2. override the method :  
```java
@Override 
@Transactional
void deleteStudentById(int theId){
    // retrieve the student 
    Student tempStudent = entityManager.find(Student.class, theId); 
    
    if(tempStudents != null ) {
        // get the courses 
        List<Course> courses = tempStudent.getCourses(); 
        
        // break association of all courses for the student 
        for(Course tempCourse : courses) {
            tempCourse.getStudents().remove(tempStudent); 
        }
        
        // now delete the student 
        entityManager.remove(tempStudent); 
    }
    
}
```
3. go to main application and delete student method 

