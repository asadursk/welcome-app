package com.example.welcome.configuration;

import com.example.welcome.services.WelcomeService;
import com.example.welcome.services.WelcomeServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeConfiguration {

    @Value("${application.officialGreeting}")
    private String officialGreeting;

    @Value("${application.unofficialGreeting}")
    private String unofficialGreeting;

    @Bean
    public WelcomeService welcomeService() {
        return new WelcomeServiceImpl(officialGreeting, unofficialGreeting);
    }
}
