## 82. Updating Objects with JPA - Coding

### the process 
1. add `void update(Student student);`  
dont forget `@Transactinal` on method  
`entityManager.merge(student)`
2. update the main app 
   * add `void updateStudent(StudentDAO studentDAO)`
   * retrieve student object based on id , id = 1 
   * edit the student last name, call set method 
   * `studentDAO.update(student)`
   * display the student 
3. verify on postgre admin 

