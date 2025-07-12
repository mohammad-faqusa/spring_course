## 58. Java Config Bean - Coding - Part 1

### Process 
1. HouseKeeping `09-java-config-bean`
2. rebuild the project
3. remove the `@PostConstruct` and `@PreDestroy`
4. in `common` package, create `SwimCoach` class
   * implements `Coach` interface
   * @override getDailyWork()
   * add constructor
5. notice we do not use `@Component` annotation in purpose
6. move the controller, inject `switmCoach`
7. run the application  
as expected will crash and fail
8. 