## 354. AOP - @Before Advice - Coding - Create Target Object - AccountDAO

### Development Process - @Before 
1. Creat target object: AccountDAO 
2. Create main app 
3. Create an Aspect with @Before advice 

#### Step 1. Creat target object: AccountDAO 
1. create new package `dao`
2. create new interface `AccountDAO`
```java

public interface AppDAO { 
    
    void addAccount(); 
}
```
3. create interface implementation
```java

@Repository
public class AccountDAOImpl implements AccountDAO { 
    @Override 
    public void addAccount() {

        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
```
4. navigate to `main` application 
5. add the method and call it in runner 
```java
CommandLineRunner commandLineRunner(AccountDAO theAccountDAO )
private of @Bean void demoTheBeforeAdvice(theAccountDAO) {
    
}
```
* will automatically inject the dependency of `AccountDAO` because  annotation 
6. create the method : `demoTheBeforeAdvice`
```java
private void demoTheBeforeAdvice(AccountDAO theAccountDAO) {
    
    theAccountDAO.addAccount(); 
}
```
7. run the application 
