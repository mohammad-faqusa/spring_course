package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {

        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        // retrieve the user detials
        jdbcUserDetailsManager.setUsersByUsernameQuery("select user_id, pw, active from members where user_id=?");

        // retrieve the authorities
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select user_id, role from roles where user_id=?");
        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(configurer -> {
                    configurer
                            .requestMatchers(HttpMethod.GET , "/api/employees").hasRole("EMPLOYEE")
                            .requestMatchers(HttpMethod.GET , "/api/employees/**").hasRole("EMPLOYEE")
                            .requestMatchers(HttpMethod.POST , "/api/employees").hasRole("MANAGER")
                            .requestMatchers(HttpMethod.POST , "/api/employees/").hasRole("MANAGER") // just in case
                            .requestMatchers(HttpMethod.PUT , "/api/employees").hasRole("MANAGER")
                            .requestMatchers(HttpMethod.DELETE , "/api/employees/**").hasRole("ADMIN")
                            .anyRequest().authenticated();
                })
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager () {
//        UserDetails john = User.builder()
//                .username("john")
//                .password("{noop}john123")
//                .roles("EMPLOYEE")
//                .build();
//        UserDetails mery = User.builder()
//                .username("mery")
//                .password("{noop}mery123")
//                .roles("EMPLOYEE", "MANAGER")
//                .build();
//
//        UserDetails susan = User.builder()
//                .username("susan")
//                .password("{noop}susan123")
//                .roles("EMPLOYEE", "MANAGER", "ADMIN")
//                .build();
//
//        return  new InMemoryUserDetailsManager(john, mery, susan);
//    }

}

