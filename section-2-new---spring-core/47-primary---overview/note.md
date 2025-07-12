## @Primary annotation

### Resolving issue iwht Multiple Coach implementations
* in the case of multiple Coach implementations 
  * We resolved it using @Qualifier
  * We specified a coach by name
* **Alternate solution available**

### Alternate Solution
* Instead of specifying a coach by name using `@Qualifier`
* I simply need a coach ... I don't care which coach
  * if there is multiple coaches out there
  * Then you coaches figure it out ... and tell me who`s the primary coach
* we add `@Priamry` annotaiton inside the implemented Caoch class  
below `@Component`
* so there is no need to use `@Qualifier` annotation inside **Rest Controller** 


### @Primary - Only one
* When using @Priamry, can have only one for multiple implementations 
* if you mark **multiple** classes with `@Primary`,  
then we have `error`

### Mixing @Primary and @Qualifier
* **Qualifier** has higher priority 
* it is recommended to use qualifier
  * More specific 
  * Higher priority 
