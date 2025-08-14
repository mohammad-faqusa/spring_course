## 383. AOP: @AfterReturning Advice - Coding - Part 1

### Development Process - @AfterReturning 
1. Prep Work : add constructors to Account class 
2. Add new method: `findAccounts() `in AccountDAO 
3. Update main app to call the nwe method: `findAccounts()`
4. Add `@AfterReturning` advice 

#### Step 1: Add constructors to Account class 
```java
public class Account {
    
    private String name; 
    
    private String level; 
    
    // default constructor 
    
    // 2 params constructor 
    
    // toString 
}
```

#### Add enew method : `findAccounts()` , in `AccountDAO`
```java
@Override 
public List<Account> findAccounts(){
    
    List<Account> myAccounts = new ArrayList<>();
    
    // create sample accounts 
    Account temp1 = new Account("John", "Silver"); 
    Account temp2 = new Account("Madhu", "Plantinum"); 
    Account temp3 = new Account("Luca", "Gold");
    
    // add them to our accounts list 
    myAccounts.add(temp1); 
    myAccounts.add(temp2); 
    myAccounts.add(temp3); 
    
    return myAccounts; 
}
```