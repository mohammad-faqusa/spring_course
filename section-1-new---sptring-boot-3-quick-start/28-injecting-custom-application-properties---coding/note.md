## Process 
1. Stop the app if running 
2. HouseKeeping work  
project name : 06-properties-demo
3. move to **application.properties**
4. add custom properties like  
coach.name=Mickey Mouse  
team.name=The Mouse Club
5. Inject the properties to **Spring Boot Application** using `@Value`
    ```java
    @RestController
    public class FunRestController {
        
        @Value("${coach.name}")
        private String coachName; 
        
        @Value("${teamName}")
        private String teamName;
   
        //expose new endpoint for "teaminfo"
        @GetMapping("/teaminfo")
        public String getTeamInfo() {
            return "Coach: " + coachName + ", Team name: " + teamName;
        }    
    }
    ```
6. Run the applicatoin 
7. access `/teaminfo` in browser
8. 