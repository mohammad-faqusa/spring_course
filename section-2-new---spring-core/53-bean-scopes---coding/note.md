## 53. Bean Scopes - Coding

### Process 
1. HouseKeeping `07-bean-scopes`
2. rebuild the project
3. remove the **lazy initialization and global configuration**
4. move to `DemoController`
   * add new field `anotherCoach`
   * update the constructor to inject `anotherCoach`
    ```java
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach
    ) {
        System.out.println("In constructor: "+ getClass().getSimpleName()); 
        myCoach = theCoach; 
        anotherCoach = theAnotherCoach;
    }
    ```
   * all references now refer to the same bean  
   because it is still **default** scope 
   * add **endpoint** `/check` to the bottom to check the equality of beans
5. run the application  
move to `/check`
6. Change bean scope to **prototype**
   * add scope annotation to the bean 
    ```java
    @Component
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public class CricketCoach implements Coach {
        //...
    }
    ```
7. Now, new object instance for each injection  
two different objects are injectted (`theCoach`, `anotherCoach`)  
you can see `false` in browser `/check`
