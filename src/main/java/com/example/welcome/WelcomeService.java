package com.example.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    @Autowired
    private CustomConfig myConfig;

    public String officialGreeting(String name) {
        return this.myConfig.getOfficialGreeting() + " " + name;
    }

    public String unofficialGreeting(String name) { return this.myConfig.getUnofficialGreeting()+ " " + name; }
}
