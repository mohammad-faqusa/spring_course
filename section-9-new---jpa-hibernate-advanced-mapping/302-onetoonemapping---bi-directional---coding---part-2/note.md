## 302. @OneToOneMapping - Bi-Directional - Coding - Part 2

#### 2.1 : Update DAO interface 
```java
InstructorDetail findInstructorDetailById(int theId); 
```
#### 2.2 : Update DAO implementation
```java
InstructorDetail findInstructorDetailById(int theId){
    return entityManager.find(InstructorDetail.class, theId); 
}

```
#### 2.3 : Main app 
```java

public CommandLineRunner run(AppDAO theAppDao) {
    return runner -> {
        findInstructorDetail(theAppDao)
    };
}
private void findInstructorDetail(AppDAO theAppDao) {
    int theId = 2; 
    // get the instructor detail obejct 
    InstructorDetail temInstructorDetail = appDao.findInstructorDetailById(theId);

    // print the instructor detail 
    System.out.println("tempInstructionDetail : " + temInstructorDetail);
    // print the associated instructor 
    
    System.out.println("the associated instructor detail" + temInstructorDetail.getInstructor());

    System.out.println("Done!");
    
}
```

run the application 
