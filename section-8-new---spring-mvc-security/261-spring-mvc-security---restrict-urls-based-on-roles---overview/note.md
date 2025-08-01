## 261. Spring MVC Security - Restrict URLs Based on Roles - Overview

### Development Process 
1. Create supporting controller code and view pages 
2. Restrict Access based on Roles 

#### Step 1. Create supporting controller code and view pages 

#### Step 2. Restrict Access based on Roles 
* Update your Srpring security Java configuration file (.java)
* General Syntax 
```java
requestMatchers(<<add path to match on >>).hasRole(<< authorized role>>) 

```
* `<<add path to match on >>` : Restrict acess to a given path "/system/**"
* hasRole : Single role 
* `<< authorized role>>)`: for example : `Admin`

```java
requestMatchers(<<add path to match on >>).hasAnyRole(<< alist of authorized roles>>)

```

##### Restrict path to Employee 
```java
requestMatchers("/").hasRole("Employee")
```
##### Restrict path to MANAGER 
requestMatchers("/leaders/**").hasRole("MANAGER")
`"/leaders/**"` : match on path : /leaders and all sub-directoreis (**)


#### Pull it together : 
```java
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    
    http.authorizeHttpRequests(configurer -> 
                        configurer
                                .requestMatchers("/").hasRoles("Employee")
                                .requestMatchers("/leaders/**").hasRole("MANAGER")
                                .requestMatchers("/systems/**").hasRole("ADMIN")
                                .anyRequest().authenticated()); 
    
}
```