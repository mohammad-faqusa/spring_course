## 155. Spring Boot REST API Security - Restrict URLs based on Roles - Coding - Part 1

### The process 
1. open `DemoSecurityConfig.java`
```java
@Configuration 
public class DemoSecurityConfig {
    
    @Bean 
    public InMemoryUserDetailManager userDetailManager() {
        
        UserDetails mohammad = User.builder()
                .username("mohammad")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();
        
        UserDetails ahmad = User.builder()
                .username("ahmad")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        
        UserDetails ali = User.builder()
                .username("ali")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();
        
        return new InMemoryUserDetailManager(john, mary, susan);
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
        http.authorizeHttpRequests(configurer -> {
            configurer
                    .requestMatchers(HttpMethod.GET, "api/employees").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.GET, "api/employees/**").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.POST, "api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.PUT, "api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.DELETE, "api/employees/**").hasRole("ADMIN");
        });
        
        // USE http basic authentication 
        http.httpBasic(Customizer.withDefaults()); 
        
        // disable Cross site request Forgery (CSRF)
        // in general , not required for stateless REST APIs that use POST, PUT, DELETE, and/or PATCH
        http.csrf(csrf -> csrf.disable()); 
        
        return http.build(); 
    }
}
```