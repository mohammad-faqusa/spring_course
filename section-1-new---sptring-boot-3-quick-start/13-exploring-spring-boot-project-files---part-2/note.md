## Application Properites 
in resources package 

#### application.properties
* created by spring initializer,  
empty at beginning
* can add Spring boot properties  
_server.port=8585_
* add your custom properties  
_coach.name=Mohammad Faqusa_
* ```java
    @RestController
    public classFunRestController {
        @Value("$coach.name}")
        private String coachName;
        @Value("team.name}")
        private String teamName;
  
## Statci Content: 
in resource directory : _static_ directoyr 

#### note : do not use web app , if application is packaged as JAR
 it works only with WAR packaging

## Unit Test
in path : _test/java/com/project_name/springboot/demo/application_name_


