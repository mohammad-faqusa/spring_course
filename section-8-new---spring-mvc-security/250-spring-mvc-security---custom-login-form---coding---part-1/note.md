## 250. Spring MVC Security - Custom Login Form - Coding - Part 1

### Development Process 
1. MOdify Spring Security Configuration to refernce custom login form 
2. Develop a Controller to show the custom login form 
3. Create custom login form 
   * HTML (CSS optional)
   * Spring MVC form tag <form:form> 


#### Step 1 : Modify Spring Security Configuration to refernce custom login form 
File: DemoSecurityConfig.java

```java
@Bean 
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    
    http.authorizeHttpRequest(configurer -> 
         configurer.anyRequest().authenticated()
    ).formLogin(form -> 
         form
                 .loginPage("/showMyLoginPage")
                 .loginProcessingUrl("/authenticateTheUser")
                 .permitAll()) ;
    return http.build(); 
}       
```
* `anyREquest().authenticated()` : any request to the app msut be authenticated (ie logged in)
* 