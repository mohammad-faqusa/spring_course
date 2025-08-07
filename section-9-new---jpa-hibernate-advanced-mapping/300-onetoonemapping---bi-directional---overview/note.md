## 300. @OneToOneMapping - Bi-Directional - Overview

#### One-To-One Mapping : 
* we currently have a unit-directional mapping 
  * ![img.png](img.png)

#### New use case : 
* if we load an InstructorDetail 
  * then we'd like to get teh associated INstructor 
* Can't do this with current **_uni-directional_** relationship 

#### Bi-Directional 
* Bi-Directional relationship is the solution 
* We can start with InstructorDetail and make it back to the Instructor 
* ![img_1.png](img_1.png)

#### Bi-Directional - Good news 
* No changed required to database 
* update the jave code 

### Development Process 
1. Make update to InstructorDetial 
   1. add new field to reference the instrcutor 
   2. add gettter /setter 
   3. add @OneToOne annotation

##### Step 1.1 : add new field to reference the instrcutor 
```java

@Entity
@Table(name="instructor")
public class Instructor {
    // .....
    
    @OneToOne(mappedBy="instructorDetail", cascade=CascadeType.ALL) 
    private Instructor instructor ; 
    
    // getter / setter 
    
}
```
* (mappedBy="instructorDetail") : refers to "instructorDetail" property in "instructor" class ; 
* a bit more on mappedBy 
* **mappedBy** tells Hibernate 
  * look at the instructorDetail property in the Instructor class 
  * Use information from the Instructor class @JoinColumn 
  * to help find associated instructor 

### Code process : 
1. Define DAO interface 
```java

public InstructorDetail findInstructorDetailById(int id);
```
2. Defien DAO implementation 
```java
@Override
public InstructorDetail findInstructorDetailById(int id){
    return entityManager.find(InstructorDetail.class, id);
}
```
3. update the main app to find the instructor detail ;



