package br.com.java.advanced.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.java.advanced")
@EnableWebMvc
public class RootConfig {

}
