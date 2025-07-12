## 51. Lazy Initialization - Coding - Part 2

### process 

1. Mark `TrackCoach` as lazy 
2. Since we are NOT injecting `TrackCoach`...  
it is **not initialized**  

#### Lazy initialization - global configuration 
3. move to `application.properties`, and type:  
`spring.main.lazy-initializtion=ture`  
**remember**: all beans are lazy, including our `DemoController`
4. run the app, and check the console  
to notice there is no printed constructors when started  
**but when request from browser** it print the constructors

