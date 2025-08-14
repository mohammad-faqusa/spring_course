## 376. AOP: Ordering Aspects - Coding - Part 2

### The process
1. move the advice code into the given classes 
2. how to share these pointcut expressions ? 
   * copy and paste
3. create new class `LuvAopExpressions`
   * will hold the pointcut expression, that classes will access 
```java
@Aspect
public class LuvAopExpressions {
    
}
```
* if you only have pointcut then `@Aspect` is optional 
  * only required if you add advices in this class : 
    * @Before, @After etc 
* we are adding it here just in case we add advices to this class in the future 
4. cut the code of pointcut code, to `LuvAopExpressions`
5. change the access modifier for each pointcut expression 
6. cut the advices from `MyLogginDemoAspect` to it's suitable aspects 
7. 