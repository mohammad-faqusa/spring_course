## 171. Spring Boot REST API Security -Custom Tables - Coding - Part 3
1. lets check the problem 
2. check the console 
3. add logging level in `applicaiton.properties`
```python
loggin.level.org.springframework.security=DEBUG
```
4. save and run the application 
5. send the request again 
6. check the console, and see the error exception 
7. `SQLSuntaxErrorException`, unknown `column`
8. the column name is `role` not `roles` 
   9. 