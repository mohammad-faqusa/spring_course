## 372. AOP: Combining Pointcuts - Coding - Part 1

### Development Process 
1. Create a pointcut declarations 
2. Combine pointcut declarations 
3. Apply pointcut declaration to advice(s) 

### The process 
1. add two fields to `AccountDAOImpl`
```java

private String name; 

private String serviceCode; 

// getters/setters 

```
4. add print command to each setter or getter 
5. copy the setters and getters to `AccountDAO` interface 
6. move to main demo app, to call the setters and getters 
```java
// call teh accountdao getter/setter methods 
theAccountDAO.setName("foobar"); 
theAccountDAO.serServiceCode("silver");

theAccountDAO.getServiceCode(); 
theAccountDAO.getName(); 

```

7. check the aspect logging 

8. run the application, and notice a lot of output, becuase the advice is applied to setters and getters methods 

