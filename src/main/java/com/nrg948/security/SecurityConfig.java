package com.nrg948.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Disable all security settings
        http.csrf().disable() // Disable CSRF
            .authorizeRequests().anyRequest().permitAll(); // Allow all requests
        http.headers().frameOptions().sameOrigin();
        return http.build();
    }
}
