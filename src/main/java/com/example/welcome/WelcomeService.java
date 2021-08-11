package com.example.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    @Autowired
    private WelcomeMessagesConfiguration welcomeMessagesConfiguration;

    public String officialGreeting(String name) {
        return welcomeMessagesConfiguration.getOfficialGreeting() + " " + name;
    }

    public String unofficialGreeting(String name) {
        return welcomeMessagesConfiguration.getUnofficialGreeting()+ " " + name;
    }
}
