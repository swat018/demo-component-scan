package me.swat018.democomponentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public String hello() {
        return "world";
    }
}
