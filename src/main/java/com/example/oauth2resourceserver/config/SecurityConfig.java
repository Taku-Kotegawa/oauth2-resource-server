package com.example.oauth2resourceserver.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/hello").hasAuthority("SCOPE_todo:write")
                .antMatchers(HttpMethod.GET, "/list").hasAuthority("SCOPE_todo:read")
                .antMatchers(HttpMethod.GET, "/").permitAll()
                .anyRequest().authenticated();
        http.oauth2ResourceServer()
                .jwt();
    }
}