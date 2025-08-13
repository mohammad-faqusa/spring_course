## 349. Comparing Spring AOP and AspectJ - Part 1

### AOP Terminology 
* Aspect: moduel of code for a cross-cutting concern (logging, security, ...)
* Advice: what action is taken and when it should be applied 
* Join Point: When to apply code during program execution 
* Pointcut : A predicate expression for where advice should be applied 

#### Advice types :
* Before advice: run before the method 
* After finally advice: run after the method (finally)
* After returning advice: run after the method (success execution ) 
* After throwing advice: run after method (if exception thrown ) 
* Around advice: run before and after method 

#### Weaving 
* Connection aspect to target object to create an advised object
* Different types of weaving 
  * compile time, load time or run time 
* Regarding performance : run-time weaving is the slowest 

#### AOP Frameworks 
* Two leading AOP Frameworks for Java
  * Sprint AOP 
  * AspectJ 

#### Spring AOP support 
* Spring provides AOP support 
* Key component of Spring 
  * Security, transactions, catching etc
* Uses run-time weaving of aspects 

#### AspectJ 
* Original aOP framework, released in 2001
  * www.eclipse.org/aspectj
* Provides complete support for AOP 
* Rich support for 
  * joint points : method-level, constructor, field
  * code weaving: compile-time, post compile-time, and load-time 
