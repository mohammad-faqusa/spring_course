## 281. Spring MVC Security - JDBC Authentication - Custom Tables - Coding - Part 1

#### Run SQL Script to set up database tables for security 
* run the sql scripts in pg admin 
  * drop previous tables
* create new table `members`
  * `user_id` varchar(50)
  * `pw` char(68)
  * `active` (boolean)
* insert data to `members` table 
* create new table `roles`
  * `user_id`
  * `role`
  * insert into roles 

