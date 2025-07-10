## Process
1. move to the project folder **05-command-line-demo**
2. in windows : 
   1. open command line in the directory  
   to verify java is installed : 
   ```bash
    echo %JAVA_HOME%
    java --version
   ```
   2. package the app , by typing in command line :  
   `mvnw package`
   3. built success, with the created jar file
   4. type : `java -jar <jar file>`
   5. to stop the application, type `ctrl + c`
   6. Run app using Spring boot maven plugin  
   `mvnw spring-boot:run`  
   stop the application using `ctrl + c`