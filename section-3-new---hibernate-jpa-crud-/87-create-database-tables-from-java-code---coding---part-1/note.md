## 87. Create Database Tables from Java Code - Coding - Part 1

### Add logging configs to log SQL statements 
1. open `application.properties`
    ```python
    # Add loggin configs to display SQL statements 
    loggin.level.hibernate.SQL=debug
    loggin.level.org.hibernate.orm.jdbc.bind=trace 
    ```
   * debug : log sql statements 
   * trace : log vlaues for SQL statements 
2. save the file
3. move to `main` application 
```java
return runner -> {
    createMultipleStudents(studentDAO); 
        }
```
4. run the application to see the loggin sql information

### break the app on purpose : 
1. drop the table student
   * in pgAdmin, drop the `student` table 
   * if you run the `SELECT` query , error generated 
2. if your run the `spring app` again, error generated `sutdent table does not exist`
3. 