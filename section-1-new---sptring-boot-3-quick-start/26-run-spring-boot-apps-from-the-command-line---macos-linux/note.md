## Packaging and running Using Mac or Linux
basically the processes is same for both OS

## Process 
1. move to directory `05-command-line-demo`
2. open terminal to the directory 
3. package `./mvnw package`  
hit **enter**  
the build is succeeded, with created jar file 
4. run the package **jar file**  
by typing `java -jar <jar file name>`
5. verify the process going to browser  
`localhost:8080/hello`
6. stop the app by typing `ctrl + c`
7. run the application using **maven plugin**  
`./mvnw spring-boot:run`

