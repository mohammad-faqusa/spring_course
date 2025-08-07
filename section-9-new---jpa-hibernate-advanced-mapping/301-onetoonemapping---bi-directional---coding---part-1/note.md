## 301. @OneToOneMapping - Bi-Directional - Coding - Part 1

### development process 
1. make updates to InstructoDetial class : 
   1. add new field to reference Instructor 
   2. add getter / setter methods for Instructor 
   3. Add @OneToOne annotation 
2. Create Main app 


### The process 
1. copy our previous project 
2. open `dev-spring-boot`
3. copy and paste the `01`, to name `02-jpa-one-to-one-bi`
4. import the project 
5. open `applicaiton.properties`
    * no changes required to db schema 
6. go to entity : `InstructorDetail`
    * add new field 
    * cut and paste to the near buttom of the class 
```java

private Instrcutor instructor; 

// getter / setter 


```

#### Step 1.3 : add onetoone annotation
```java
@OneToOne(mappedBy="instrcutorDetail", cascade = CascadeType.ALL)
private Instrcutor instructor; 

// getter / setter 


```

