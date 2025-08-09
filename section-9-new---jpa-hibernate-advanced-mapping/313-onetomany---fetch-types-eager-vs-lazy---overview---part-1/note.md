## 313. @OneToMany - Fetch Types: Eager vs Lazy - Overview - Part 1

### Fetch types : Eager vs Lazy Loading 
* When we fetch / retrieve data, should we retrieve EVERYTHING? 
  * Eager will retrieve everything 
  * Lazy will retrieve on request 

#### Eager loading 
* Eager loading will load all dependent entities 
  * Load instructor and all of their courses at once 

* what about course and students ? 
  * Could easily turn into a performance nightmare... 
  * may slow down our application 
  * for example : course to many students 
* in our app , if we are searching for a course by keyword 
  * Only want a list of matching courses
* Eager loading would still load all students for each course ... not good!

#### Best practice - Lazy Loading  : 
* only load data when absolutely needed 
* prefer lazy loading instead of Eager loading 

* lazy loading will load the main entity first 
  * load dependent entities on demand(lazy) 
