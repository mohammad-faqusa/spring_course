## 360. AOP - Pointcut Expressions - Coding - Match only AccountDAO addAccount

### Match only: AccountDAO.addAccount 
1. open the aspect file 
2. change the pointcut expression
```java
@Before("execution(public void com.luv2code.aop.dao.AccountDAO.addAccount())")
public void beforeAddAccount() {
    System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
}
```
3. go to main method
   * notice it will just match on `theAccountDAO.addAccount`
4. run the application and check the results 

