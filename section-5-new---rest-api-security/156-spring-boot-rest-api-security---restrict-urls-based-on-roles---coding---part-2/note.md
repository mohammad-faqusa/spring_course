## 156. Spring Boot REST API Security - Restrict URLs based on Roles - Coding - Part 2

### the process 
1. run the applicaiton 
2. test in `postman`
3. try diffent types of requests with different accounts 

#### Employee credential 
1. success to GET employee
2. success to GET employee by id 
3. Fail to POST, add employee
4. Fail to update an employee `PUT`
5. Fail to delete an employee `DELETE`

#### Manager credentials 
1. success to add an employee `POST`
2. FAIL to delete `DELETE`

#### ADMIN rule 
1. can delete the employee `DELETE`

