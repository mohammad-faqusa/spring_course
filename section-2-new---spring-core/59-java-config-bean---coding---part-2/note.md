## 59. Java Config Bean - Coding - Part 2

### The Process

#### Step 1: Create configuration class 
1. create new package called `config`
2. inside the package create class `SportConfig`
3. it could be name any package or any class 
4. annotate the class `@Configuration`
5. create method of type `Coach`, named `swimCoach`, as specified in the qualifier 
   * annoated with `@Bean`;
   * `return new SwimCoach();`

**Remember** SwimCoach did not have @Component
* instead we configured as a Spring bean using `@Bean`

### @Bean use case
Take existing third-party class and expose as a Spring bean

### Give custom bean id 
```java
@Bean("aquatic")
public Coach swimCoach() {
    return new SwimCoach(); 
}
```

then inject it with the specified bean id `aquatic` in Rest controller
```java
@Autowired 
public DemoController(@Qualifier("aquatic") Coach theCoach) {
    // ...
}
```