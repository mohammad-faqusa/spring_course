### Process
1. HouseKeeping `05-primary`
2. open the project
3. rebuild the project
4. delete `util` package, no need for that
5. remove `@Qualifier` annotation
6. add the `@Primary` annotation in one of the impleneted **Coach** interface  
for example `TrackCoach`
7. run the application
8. move to browser and check

### Let's break it in purpose 
1. add multiple **@Primary** components
2. run the application and check the error  
`more than one 'primary' bean bound among candidates`
3. return with one `@Primary` annotation
4. run the application