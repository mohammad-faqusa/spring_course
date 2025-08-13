## 350. Comparing Spring AOP and AspectJ - Part 2

### Spring AOP Comparison 

#### Advantages 
* simpler to use than AspectJ 
* Uses Proxy pattern 
* Can migrate to ASpectJ when using @Aspect annotation 

#### Disadvantages 
* only supports method-level join points 
* Can only apply aspects to beans created by Spring app context
* Minor performance cost for aspect execution (run-time weaving) 

### AspectJ Comparison 
#### Advantages 
* Support all join points 
* Works with any POJO, not just beans from app context
* Faster performance compared to Spring AOP 
* Complete AOP support 

#### Disadvantages
* Compile-time weaving requires extra complilation step 
* AspectJ pointcut syntex can become complex 

### Comparing Spring AOP and AspectJ 
* Spring AOP only supports : 
  * Method-level join points 
  * Run-time code weaving(slower than Aspect) 
* AspecJ supports : 
  * Join points: method-level, constructor, field 
  * weaving: compile-time, post compile-time and load-time 
* Spring AOP is a light implementation of AOP 
* Solves common problems in enterprise applications 
* My recommendation 
  * Start with Spring AOP ... easy to get started with 
  * if you have complex requirements then move to AspectJ

### Additional resources 
* Spring reference manual : www.spring.io 
* AspectJ in action 
  * by Raminvas Ladded 
* Aspect-Oriented Development with use cases 
  * by ivar Jacobson and Pan-Wei Ng

