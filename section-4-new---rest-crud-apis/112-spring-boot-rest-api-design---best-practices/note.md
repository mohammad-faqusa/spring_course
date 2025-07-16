## 112. Spring Boot REST API Design - Best Practices

### REST API Design

* For real-time projects, who will use your API?
* Also, hwo iwll they use your API ? 
* Design the API based on requirements 

### API Design Process
1. review the API requirement 
2. Identify main resource / entity
3. Use HTTP methods to assign action on resource

#### Step 1: API Requirements 
* Create a REST API for the Employee Directory 
* REST Clients shoud be able to 
  * GET a list of employees
  * Get a single employee by id
  * Add a new employee
  * Update an employee
  * Delete an employee 

#### Step 2: Identify main resource / entity
* to identify main resource /entity , look for the most prominent "noun"
* For our project, it si "employee"
* Converntion is to use plural form of resource / entity : **employees**

#### Step 3: use HTTP methods to assign action on resource
HTTP methods mapped to **CRUD action** 

### Employee Real-Time project
| Http method | Endpoint                    | CRUD Action                  |
|-------------|-----------------------------|------------------------------|
| POST        | /api/employees              | Create a new employee        |
| GET         | /api/employees              | Read a list of emoployees    |
| GET         | /api/employees/{employeeId} | Read a single employee       |
| PUT         | /api/employees              | Update an existing employees |
| DELETE      | /api/employees/{employeeId} | Delete an existing employee  |

### Anti-Patterns 
* DO NOT DO THIS ... these are REST anti-patterns, bad practice 
* dont include actiosn in the endpoint
  * /api/employeeList
  * /api/deleteEmployee
  * /api/addEmployee
  * /api/updateEmployee
* **Instead** use HTTP methods to assign actions 

