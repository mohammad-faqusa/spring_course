package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager () {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}john123")
                .roles("EMPLOYEE")
                .build();
        UserDetails mery = User.builder()
                .username("mery")
                .password("{noop}mery123")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}susan123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return  new InMemoryUserDetailsManager(john, mery, susan);
    }

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {

        // authorization
        http.authorizeHttpRequests(configurer -> {
            configurer
                    .requestMatchers(HttpMethod.GET , "/api/employees" ).hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.GET , "/api/employees/**" ).hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.POST , "/api/employees" ).hasRole("MANAGER")
                    .requestMatchers(HttpMethod.PUT , "/api/employees" ).hasRole("MANAGER")
                    .requestMatchers(HttpMethod.DELETE , "/api/employees" ).hasRole("ADMIN");
        });

        // define basic authintication
        http.httpBasic(Customizer.withDefaults());

        // disable csrf
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
