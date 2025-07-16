## 125. Spring Boot Service: Add, Update, Delete - Coding

### Development Process
* create service methods for 
  * get list of employees 
  * get single employee 
  * add new employee
  * Update existing employee
  * delete employee 


1. copy the methods from DAO to `EmployeeService`,
```java
public interface EmployeeService {
    List<Employee> findAll();
    
    Employee findById(int theId); 
    
    Employee save(Employee theEmployee); 
    
    void deleteById(int theId); 
}

```
2. override the methdos in EmployeeServiceImpl 
   * delegate to `DAO`
```java
List<Employee> findAll(){} 
    
Employee findById(int theId); 

@Transactional
Employee save(Employee theEmployee){
    return employeeDAO.save(theEmployee); 
}
Transactional
void deleteById(int theId){
    employeeDAO.deleteById(theId); 
}
```