## 366. AOP - Pointcut Expressions - Coding - Match Method with Any Params

### Match method on ANY parameters 
1. go to aspect logging 
2. modify the pointcut expression 
```java
    @Before("execution(* add*(..))")
    public void beforeAddAccount() {
        System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
    }
```
3. run the application

##### if you are using intellig Ultimate 
you man encounter an error `JmxAutoConfiguration.class`

* why ? 
  * intellij ultimate loads additional classes for JMX 
  * this conflicts with Spring Boot's JMX autoconfiguration 

* when using wildcars with AOP , 
  * caution should be taken 
* if new frameworks are added to your project , 
  * then you may encounter conflicts 
* Recommendation is to : 
  * narrow your pointcut expressions 
  * limit them to your project package 

* in this case, our pointcut expression is too broad 
* We can resolve this by: 
  * narrowing the pointcut expression 
* only match within our project package 
    ```java
        @Before("execution(* com.luv2code.aopdemo.dao.*.add*(..))")
        public void beforeAddAccount() {
            System.out.println("====>>> Execution BEFORE ADD ACCOUNT ");
        }
    ```
