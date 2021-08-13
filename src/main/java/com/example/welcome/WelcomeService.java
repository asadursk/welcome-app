package com.example.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    @Autowired
    private WelcomeMessagesConfiguration welcomeMessagesConfiguration;

    public ResponseDTO officialGreeting(String name) {
        return new ResponseDTO(welcomeMessagesConfiguration.getOfficialGreeting() + " " + name, GreetingType.OFFICIAL);
    }

    public ResponseDTO unofficialGreeting(String name) {
        return new ResponseDTO(welcomeMessagesConfiguration.getUnofficialGreeting()+ " " + name, GreetingType.UNOFFICIAL);
    }
}
