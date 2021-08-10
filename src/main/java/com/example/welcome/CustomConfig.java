package com.example.welcome;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "spring")
public class CustomConfig {

    @Getter
    @Setter
    private String officialGreeting;

    @Getter
    @Setter
    private String unofficialGreeting;
}
