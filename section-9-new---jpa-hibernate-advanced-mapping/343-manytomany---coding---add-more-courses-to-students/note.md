## 343. @ManyToMany - Coding - Add More Courses to Students

### Add more courses to student 
1. go to the dao interface   
```java
void update(Student tempStudent);
```
2. implement the dao method  
```java
@Override
@Transactional
void update(Student tempStudent) { 
    entityManager.merge(tempStudent); 
}
```
3. move to the main application  
```java
private void addMoreCoursesForStudent(AppDAO theAppDAO) {
    // find the student 
    int theId = 2; 
    
    Student tempStudent = theAppDAO.findStudentAndCoursesByStudentId(theId); 
    
    // create more courses 
    Course tempCourse1 = new Course("Rubik's Cube - How to speed Cube"); 
    Course tempCourse2 = new Course("Atari 2600 - Game development"); 
    
    // add courses to the student 
    tempStudent.addCourse(tempCourse1); 
    tempStudent.addCourse(tempCourse2);

    System.out.println("Saving student : " + tempStudent);
    System.out.println("Associated courses : " + tempStudent.getCourses());
    
    theAppDAO.update(tempStudent);
}
```
4. run the application 
5. see the data in db 



