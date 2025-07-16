## 114. Spring Boot REST Project Overview

### API Requirements 
* Create a REST PI for the employee irectory 
* Rest Clients should be able to 
  * get a list of employees 
  * get a single employee 
  * add new employee
  * update an employee
  * delete an employee

### Employee Real-Time project
| Http method | Endpoint                    | CRUD Action                  |
|-------------|-----------------------------|------------------------------|
| POST        | /api/employees              | Create a new employee        |
| GET         | /api/employees              | Read a list of emoployees    |
| GET         | /api/employees/{employeeId} | Read a single employee       |
| PUT         | /api/employees              | Update an existing employees |
| DELETE      | /api/employees/{employeeId} | Delete an existing employee  |

### Development Process 
1. Set up database dev environment s
2. create spring boot project using spring init
3. get list of employees 
4. get single employee by id 
5. add new employee
6. update an existing employee
7. delete an exsiting employee 

### Application Architecure 
employee rest controller - employee Service - Employee DAO - database

