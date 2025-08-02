package com.luv2code.springboot.demosecurity.security;

import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DemoSecurityConfig {
    @Bean
    public UserDetialsManager userDetailsManager(DataSource dataSource) {
        return new jdbcUserDetailsManager(dataSource);
    }
}