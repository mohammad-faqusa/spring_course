## 264. Spring MVC Security - Restrict URLs Based on Roles - Coding - Part 3

#### Step 2: Restrict Access based on Roles 
1. open `DemoSecurityConfig.java`
```java
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/").hasRole("EMPLOYEE")
                .requestMatchers("/leaders/**").hasRole("MANAGER")
                .requestMatchers("/systems/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated())
                .formLogin(form ->
                        form.loginPage("/showLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll())
                .logout(logout -> logout.permitAll());
        return http.build();
    }
```
2. try to run the application , and enter the **leaders** page from `Employee` role 
3. try with role `MANAGER`