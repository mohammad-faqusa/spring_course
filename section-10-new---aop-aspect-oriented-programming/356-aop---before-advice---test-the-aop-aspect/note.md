## 356. AOP - @Before Advice - Test the AOP Aspect

### The process 
1. run the application 
2. update the method in main app 
```java
private void demoTheBeforeAdvice(AccountDAO accountDAO) {
    accountDAO.addAccount();

    System.out.println("\n let's call it again \n");
    
    accountDAO.addAccount();
}

```
3. run the application 
4. 