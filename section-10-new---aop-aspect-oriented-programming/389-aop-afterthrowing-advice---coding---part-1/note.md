## 389. AOP: @AfterThrowing Advice - Coding - Part 1

### Development Process - @AfterThrowing 
1. In Main app, add a tryp/catch block for exception handling 
2. Modify AccountDAO to simulate throwing an exception 
3. Add @AfterThrowing advice 

```java
private void demoTheAfterThrowingAdvice(AccountDAO theAccountDAO) {
    
    // call the findAccounts
    List<Account> theAccounts = null ;
    try{
        // add a boolean flag to simulate exceptions 
        boolean tripWire = true; 
        theAccounts = accountDAO.findAccounts(tripWire);
        // add new method to DAO that accept boolean 
    }
    catch(Exception exc) {
        System.out.println("\n\nMain Program: ... caught exception : " + exc);
    }

    // display the accounts
    System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
    System.out.println("-------------");

    System.out.println(theAccounts);

    System.out.println("\n");
}
```
2. in DAO impl :

```java
@Override 
public List<Account> findAccount() {
    return findAccounts(false); // don't throw an exception 
}

@Override
public List<Account> findAccounts(boolean tripWire) {
    
    // for academic purposes ... simulate an exception 
    if (tripWire) {
        throw new RuntimeException("No soup for you!!!"); 
    }
    
    List<Account> accounts = new ArrayList<>();

    // create sample accounts
    Account temp1 = new Account("mohammad", "m@gmail.com");
    Account temp2 = new Account("ahmad", "a@gmail.com");
    Account temp3 = new Account("sami", "s@gmail.com");

    // add to list accounts :
    accounts.add(temp1);
    accounts.add(temp2);
    accounts.add(temp3);

    // return the accounts
    return accounts;
}
```
3. run the application 
4. 