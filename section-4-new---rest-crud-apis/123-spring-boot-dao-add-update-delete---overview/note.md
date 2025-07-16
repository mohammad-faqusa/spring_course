## 123. Spring Boot DAO: Add, Update, Delete - Overview

### Service Layer - Best Practice
* Best practice is to apply transactional boundaries at the service layer 
* It is the service layer's responsibility to manage transaction boundaries 
* For implementation code
  * Apply @**Transactional** on service methods
  * Remove @**Transactional**  on DAO methdos if they already exist 

### Development process 
4. Get a single employee by Id
5. add a new employee
6. Update an existing employee
7. Delete an existing employee 

#### DAO: Get a single employee 
```java

public Employee findById(int theId) {
    // get the employee 
    Employee theEmployee = entityManger.find(Employee.class, theId);
    
    // return the employee
    return theEmployee; 
}
```

#### DAO: Add or Update employee 
```java

public Employee save(Employee theEmployee) {
    // save or udpate the employee 
    Employee dbEmployee = entityManger.merge(theEmployee); 
    
    // return dbEmployee
    return dbEmployee; 
}
```
* we don't use @Transactional at DAL layer, becuase it is **managed** in service layer 

#### DAO: Delete an existing employee
```java

public Employee deleteById(int theId) {
    // find the employee by id 
    Employee theEmployee = entityManager.find(Employee.class, theId);
    
    // delete the employee
    entityManager.remove(theEmployee); 
}
```