## 275. Spring MVC Security - JDBC Authentication - Plain Text - Coding - Part 3

#### Update Spring Security Configuration to use JDBC 

1. move to `DemoSecurityConfig`
```java
package com.luv2code.springboot.demosecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
    
    // add support for JDBC ... no more hardcoded users :-) 
    
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        
        return new JdbcUserDetailsManager(dataSource); 
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/").hasRole("EMPLOYEE")
                .requestMatchers("leaders/**").hasRole("MANAGER")
                .requestMatchers("systems/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated())
                .formLogin(form ->
                        form.loginPage("/showLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll())
                .logout(logout -> logout.permitAll())
                .exceptionHandling(exception -> exception.accessDeniedPage("/access-denied"));
        return http.build();
    }
    
    /*
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {

        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails suzan = User.builder()
                .username("suzan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return  new InMemoryUserDetailsManager(john, mary, suzan);

    }
*/
}

```