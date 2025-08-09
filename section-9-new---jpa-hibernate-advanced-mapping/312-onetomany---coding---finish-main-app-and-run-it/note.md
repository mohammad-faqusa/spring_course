## 312. @OneToMany - Coding - Finish Main App and Run It!

```java
// complete from previous part 

Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide"); 
Course tempCourse2 = new Course("The Pinball Masterclass");

// add courses to instructor 
tempInstructor.add(tempCourse1);
tempInstructor.add(tempCourse2);

//save the instructor 

System.out.println("Saving instructor: " + tempInstructor); 
System.out.println("The courses: " + tempInstructor.getCourses()); 
appDAO.save(tempInstructor);

System.out.println("Done!"); 
```

2. run the application 
3. check in pgAdming for the updated data 
4. the autoincrement is 10 
5. 