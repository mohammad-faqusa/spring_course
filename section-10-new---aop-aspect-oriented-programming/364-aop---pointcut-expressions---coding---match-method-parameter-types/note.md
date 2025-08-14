## 364. AOP - Pointcut Expressions - Coding - Match Method Parameter Types

### Match method with "Account" Param Type 
1. go to logging aspect 
2. change the pointcut expression 
```java
    @Before("execution(* add*())")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
3. but before that we need to create **new class** `Account` in package `aopdemo`
```java

public class Account {
    
    private String name ; 
    
    private String level; 
    
    // setters / getters 
    
    
}
```
4. add param type `Account` in method `addAccount` in dao interface 
5. update dao implementation 
6. change the pointcut expression and aspect logging 
```java
    @Before("execution(* add*(com.luv2code.aopdemo.Account))")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
7. go to main application, and update the method call `addAccount`
```java
    private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        Account myAccount = new Account(); 
    
        accountDAO.addAccount(myAccount);

        membershipDAO.addSilly();

    }
```
8. run the application and check the results 

