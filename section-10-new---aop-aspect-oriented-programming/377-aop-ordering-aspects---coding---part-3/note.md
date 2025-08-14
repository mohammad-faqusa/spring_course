## 377. AOP: Ordering Aspects - Coding - Part 3

### The process 
1. run the application, 
   * Notice non of AOP advices are executing 
2. debug the application 
   * open `application.peroperties`
   * enable debug logging for AOP 
```properties
logging.level.org.springframework.aop=DEBUG
```
3. run the application again 
4. found the three aspect methods , 
   * Pointcut parser rejected expression 
   * can't find referenced pointcut 
   * solution : give fully qulaified class name : `<package>+<class>`
```java
@Before("LuvAopExpressions.forDaoPackageNoGetterSetter()")
public void beforeAddAccount() {
    System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
}
```
5. the application run seccessfully 

#### Step 2: Add @Order annotation to Aspects 
```java
@Aspect
@Component
@Order(1) 
```
1. cloud order : 1 
2. api order : 3 
3. demo order : 2 