package com.example.welcome;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "application")
public class WelcomeMessagesConfiguration {

    private String officialGreeting;

    private String unofficialGreeting;
}
