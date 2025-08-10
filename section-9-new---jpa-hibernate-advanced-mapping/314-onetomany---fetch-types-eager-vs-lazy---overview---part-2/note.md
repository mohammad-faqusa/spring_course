## 314. @OneToMany - Fetch Types: Eager vs Lazy - Overview - Part 2

#### Real-World Use Case 
* search for instructions 
* In master view , use lazy loading 
* in Detail view, retrieve the entity and necessary dependent entities 


#### Real-World Use Case - Master view 
* In master view, use lazy loading for search results 
* Only load instructors ... not their courses 

#### Real-World Use Case - Detail view 
* In Detail view, retrieve the entity and necessary dependent entities 
* Load instructor AND their courses 

#### Fetch Type 
* When you define the mapping relationship 
  * you can specify the fetch type : EAGER or LAZY 
```java
public class Instructor {
    OneToMany(mappedBy = "instructor", fetch = FetchType.LAZY)
        private List<Course> courses; 
}
```

##### Default fetch types : 
| Mapping     | Default Fetch type |
|-------------|--------------------|
| @OneToOne   | FetchType.EAGER    |
| @OneToMany  | FetchType.LAZY     |
| @ManyToOne  | FetchType.EAGER    |
| @ManyToMany | FetchType.LAZY     |

##### Overriding default fetch type : 
* specifying the fetch type, overrides the defaults 
```java
public class Course {
    ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private Instructor instructor; 
}
```

#### More about lazy loading : 
* when you lazy load, the data is only retrieve on demand 
* however, this requires an open Hibernate session 
  * need a connection to database to retrieve data 
* if the Hibernate session is closed : 
* the data is not retrieved 
* if the Hibernate session is open : 
  * And you attempt to retrieve lazy data 
  * Hibernate will throw an exception 
    * later we show how to resolve this issue 

