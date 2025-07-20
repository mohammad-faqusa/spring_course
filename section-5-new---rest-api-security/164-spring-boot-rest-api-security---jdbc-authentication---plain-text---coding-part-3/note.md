## 164. Spring Boot REST API Security - JDBC Authentication - Plain Text - Coding Part 3

### process
1. try to change the password of user `john` in pgAdmin  
update script 
2. try to request in `postman` with the old database 
3. it will fail 
4. bacuase spring security query the database for each login 
5. try to delete an employee 
   * we know **john** cna't delete a user 
   * `Unauthorized`