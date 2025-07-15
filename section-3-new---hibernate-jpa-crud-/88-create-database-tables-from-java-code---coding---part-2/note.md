## 88. Create Database Tables from Java Code - Coding - Part 2

### Add new Configuration to auto create the tables 
```python
# Add loggin configs to display SQL statements 
loggin.level.hibernate.SQL=debug
loggin.level.org.hibernate.orm.jdbc.bind=trace

# Configure JPA/Hibernate to auto create the tables 
spring.jpa.hihbernate.ddl-auto=create 
```
* will the drop the tables if exists, and create the tables 
* run the main app, to check the logs 
  * you notics table is dropped
  * table is created 
* try to run the app a couple more times 
  * every time run, drop and create the tables

### change the configuration to "UPDATE"
```python
# Configure JPA/Hibernate to auto create the tables 
# the "update" config will keep existing data in the table
spring.jpa.hihbernate.ddl-auto=update 
```
* run the applicaiton one more time 
* swing back to pgAdmin 
* you notice **old data** still exists, with adding new data 
* run couple more time s
  * the rows are increased **multiple times** 


