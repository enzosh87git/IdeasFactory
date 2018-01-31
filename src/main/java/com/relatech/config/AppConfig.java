package com.relatech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.relatech.security.WebSecurityConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.relatech")
@Import( WebSecurityConfig.class )
public class AppConfig {

}