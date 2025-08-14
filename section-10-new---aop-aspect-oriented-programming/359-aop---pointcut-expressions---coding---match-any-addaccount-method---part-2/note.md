## 359. AOP - Pointcut Expressions - Coding - Match any addAccount Method - Part 2

### Match any method named: addAccount 
1. lets add `MembershipDAO` , and create method `addAccount`
2. copy and paste the `AccountDAO`  interface with name `MembershipDAO`
3. copy and paste the `AccountDAOImpl` to `MembershipDAOImpl`
4. edit print in method `addAccount`
5. the pointcut expression also should match this method, because we have declared any class 
6. go to `main` application, and add to `commandLineRunner` parameter with `MemberShipDAO`
```java
theMembershipDAO.addAccount(); 
```
7. run the application