## Lets break it on purpose 

## Process 
1. create new package, next to `sptringcoredemo`
name : com.luv2code.util
2. move the files in `common` package to `util` package
3. **note**
  * by default, the **spring boot application** will not scan the util package
  * when testing  
  `application could not be start`  
  `Coach is not found!`
4. explicit tell `spring boot appp` how to find these packages
  ```java
  @SpringBootApplication(
          scanBasePackages= {"com.luv2code.springcoredemo", "com.luv2code.util"})
  public class SpringcoredemoApplicaiton {
      
      public static void main(String [] args) {
          SpringApplication.run(StringcoredemoApplication, args); 
      }
  }
  ```
5. test and run 
6. after successfull run, get back to defualt case

