### The process
1. HouseKeeping `04-qualifiers`
2. go to `DemoController`
3. change the `constructor injection`
```java
@Autowired
public DemoController(@Qualifier(), Coach theCoach) {
    myCoach = theCoach; 
}
```
4. Create multiple implementations
5. new class `BaseballCaoch` implements Coach
6. new class `TennisCoach`
7. new class `TrackCoach`
8. try to run the project to check the error  
`make sure you use Qualifier Annotation`
9. add quarlifier to constructor injection, with camalCase format  
`DemoController(@Qualifier("baseballCoach") Coach theCoach)`
10. try to use qualifier for other beans 
11. 