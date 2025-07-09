# Sptring boot dev tools 

## the problem 
* when running spring boot applications 
  * if you make changes to source code
  * then you **have to mnaually restart the application** 

## solution 
**spring-boot-devtools** to the rescue 
automatically restart the app
simply add dependency 
no need to write additional code

## use dev tools 
we add the dev tools in pom dependencies  

```xml
    <dependency>
        <groupId>
        <artifactId>srpring-boot-devtools
    </dependency>
   ```

## intellig community editon - dev tools 
* does not support dev tools by default 
* select : **preferences \> build, Excecution, Deployement \> compiler** 
* also : preferences / advanced settings / allow auto-make to start even if developed 
* 

## Development Process 
1. apply intellig configurations 
2. edit pom.xml and add **spring-boot-devtools**
3. add new Rest ednpoint to our app
4. verify if app is automatically reloaded 

