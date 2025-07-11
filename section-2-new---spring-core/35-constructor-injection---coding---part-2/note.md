## Process 
1. in com.lub2coe.springcoredemo directoyr  
create new Class,  
create interface
2. inside the coach interface  
write the method `String getDailyWorkout`
3. create class `CricketCoach` that imeplements the Coach interface
4. override the method specified in the interface  
return "Practice fast bowling for 15 minutes";
5. mark the `Coach` as **@Component**
6. Create REST controller  
create class named **DemoController**  
annotate `RestController`
7. define the Coach inside the RestController
8. type 
    ```java
    @Autowired
    public DemoController(Coach theCoach) {
   myCoach = theCoach;
   }
    ```
9. add endpoint `@GetMapping`
   ```java
   @GetMappin("getdailyworkout")
   public String getDailyWorkout() {
       return myCoach.getDailyWorkout(); 
   }
   ```
10. swing into web browser to verify 
11. check the automake in **advance settings**, and in compiler 


