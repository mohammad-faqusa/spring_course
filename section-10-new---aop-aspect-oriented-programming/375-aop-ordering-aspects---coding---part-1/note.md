## 375. AOP: Ordering Aspects - Coding - Part 1

### Development Process
1. Refactor: Place advices in separate Aspects 
2. Add @Order annotation to Aspects 


### The process 
1. go to `aspect` package , to `demoLoggingAspect`
   * we have two advices
   * add more advice `LogToCloudAsync`, and update the system printline 
   * now we have three advices 
2. run the application, and test it out 
3. create the classes in aspect package , with its annotations : 
   1. create new class `MyApiAnalyticsAspect`
   2. create new class `MyCloudLogAsyncAspect`
