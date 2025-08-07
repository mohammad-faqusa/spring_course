## 296. @OneToOneMapping - Coding - Develop the Main App

### The process 
1. move to `CruddemoApplication.java`
```java

public class CruddemoApplication {
    
//    public static void main(String [] args)
    
    @Bean 
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        
        return runner -> {
            createInstructor(appDAO); 
        };
    }
    
    private void createInstructor(AppDAO appDAO) {
        
        // create the instructor 
        
        Instructor tempInstructor = new Instructor("Mohammad", "Faqusa", "mohammad@gmail.com");
        
        // create the instructor detail 
        InstructorDetail tempInstructorDetail = new InstructorDetail(
                "http://www.faqusa.com/youtube",
                "love to code!!!"
        ); 
        
        // associate the objects 
        tempInstructor.setInstructorDetail(tempInstructorDetail);
        
        // save the instructor 
        System.out.println("Saving instructor : " + tempInstructor);
        appDAO.save(tempInstructor);

        System.out.println("Done!");
        
    }
}



```
* inject AppDAO 
  * will inject automatically, so no need for `Autowired`

2. Open the `application.properties` file 
```properties
# Show JPA/Hibernate loggin messages 
logging.level.org.hibernate.SQL=trace  
Logging.level.org.hibernate.orm.jdbc.bind=trace 

```
* .SQL=trace  : Log SQL statements 
* .orm.jdbc.bind=trace : Log Values for SQL Statements 

