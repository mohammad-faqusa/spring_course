## 370. AOP: Pointcut Declarations - Coding - Part 2

### Add another advice ... reuse point declaration 

```java
@Befoer("forDaoPackage()")
public void performApiAnalytics() {
    System.out.println("\n=======>>>> Performing API analytics");
}
```