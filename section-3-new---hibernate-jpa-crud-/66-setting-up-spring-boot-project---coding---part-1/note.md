## 66. Setting Up Spring Boot Project - Coding - Part 1

### Process
1. go to spring initializer  
project : maven  
language : java  
group : com.luv2code  
artifact id : cruddemo  
packaging : jar  
java  :17  
2. on dependency section : 
   1. JPA 
   2. postgre 
3. download the poject with name : `01-cruddemo-student`, saved in `00-sql..`
4. open the project in intellig 
5. create runner app
    ```java
    @Bean
    public CommandLineRunner (String [] args) {
        return runner -> {
            System.out.println("Hello World"); 
        };
    }
    ```
   * this will be executed after the Spring Beans have been loaded
   * your custom code in `runner`
