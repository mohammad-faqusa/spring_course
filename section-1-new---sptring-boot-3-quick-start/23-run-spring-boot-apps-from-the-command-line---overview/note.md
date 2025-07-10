## Running from the Command-Line 

* during development we spend most of time in IDE
* However, we may want to run Spring Boot outside the IDE
* one approach is **running from command line**
* sense spring boot is self contained (JAR file and include the server)
* you have two options : 
  * option 1: use `java -jar <name of jar file>`
  * option 2: use Spring Boot Maven plugin

## Spring Boot maven plugin
* **mvnw** allows you to run a Maven project
  * no need to have Maven installed or present on your path
  * If correct version of Maven is NOT found on your computer
    * **Automatically downloads** correct version and runs Maven
  * Two files are provided 
    * **mvnw.cmd** for MS Windows
    * **mvnw.sh** for Linux/Mac 
* if you have **Maven** installed previously
  * Then you can ignore/delete the **mvnw** files
  * just use Maven as you normally would  
`$ mvn clean compile test`
* Use Spring Boot Maven plugin  
    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
        
    ```  
    so we use it to package or run our application  
`$ ./mvnw package`  
`$ ./mvnw spring-boot:run`  
and we can use the following if Maven is already installed  
`$ mvn package`, `mvn spring-boot:run`
* 

## Development Process 
1. Exit the IDE 
2. Package the app using `mvnw package` 
3. Run app using `java -jar`

