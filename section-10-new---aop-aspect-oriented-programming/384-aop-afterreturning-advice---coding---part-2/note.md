## 384. AOP: @AfterReturning Advice - Coding - Part 2

### The process : 
1. in main application 
```java
public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {
    
    return runner -> {
        demoTheAfterReturningAdvice(theAccountDAO); 
    };
}

private void demoTheAfterReturningAdvice(AccountDAO theAccountDAO) {
    
    // call method to find the a ccounts 
    List<Account> theAccounts = theAccountDAO.findAccounts(); 
    
    // display the accounts 
    System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
    System.out.println("---------");

    System.out.println(theAccounts);

    System.out.println("\n");
}
```

2. run the application 