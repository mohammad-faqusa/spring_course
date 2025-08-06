## 291. @OneToOne Mapping - Set up Spring Boot Project - Part 1

### Development process 
1. create starter project 
   * group : com.luv2code 
   * artifact : cruddemo
   * packageing : jar 
   * java 17 
   * dependencies 
     * postgre driver 
     * spring data jpa 
   * generate the project 
2. download the folder with name : `01-jpa-one-to-one-uni`
3. copy the folder to `09-...`
4. import in intellig 
5. in main method : _create command line runner_
```java
@Bean 
public CommandLinseRunner commandLineRunner(String [] args) {
    
    return runner -> {
        System.out.println("Hello World");
    }; 
}
```