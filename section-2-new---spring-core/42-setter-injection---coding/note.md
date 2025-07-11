
## Process : 
1. houseKeeping `03-setter-injection`
2. move to `DemoController`
3. delete previous code (constructor injection)
4. ```java
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoah; 
    }
    ```
5. run the app
6. you can make modification  
instead of using **traditional setter method**,  
you can name **with any method** like `doAnyStuff()`

