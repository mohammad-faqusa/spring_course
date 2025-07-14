## 75. Changing Index of MySQL Auto Increment

### The process 
1. query to edit the auto increment
2. by selecting the table , and determine the **first** value 
3. run the spring application , and notice the change 

### how to reset the auto increment values back to 1 ?
1. `TRUNCATE` the table , and execute the query 
2. then auto increment, is set to one 
3. run the **spring** application 
4. you will notice change in the table 
5. 