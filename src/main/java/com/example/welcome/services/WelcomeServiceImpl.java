package com.example.welcome.services;

import com.example.welcome.enums.GreetingType;
import com.example.welcome.models.ResponseDTO;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
public class WelcomeServiceImpl implements WelcomeService {

    private String officialGreeting;

    private String getUnofficialGreeting;

    public ResponseDTO getOfficialGreeting(String name) {
        return new ResponseDTO(officialGreeting + " " + name, GreetingType.OFFICIAL, getCurrentDateTime());
    }

    public ResponseDTO getUnofficialGreeting(String name) {
        return new ResponseDTO(getUnofficialGreeting + " " + name, GreetingType.UNOFFICIAL, getCurrentDateTime());
    }

    private Timestamp getCurrentDateTime() {
        Date date = new Date();
        return new Timestamp(date.getTime());
    }
}
