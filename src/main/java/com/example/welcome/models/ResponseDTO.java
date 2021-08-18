package com.example.welcome.models;

import com.example.welcome.enums.GreetingType;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class ResponseDTO {
    private final String message;

    private final GreetingType greetingType;

    private final Timestamp datetime;

    private final String endpoint;

    public ResponseDTO(String message, GreetingType greetingType, Timestamp timestamp) {
        this.message = message;
        this.greetingType = greetingType;
        this.endpoint = returnPathFormat(greetingType);
        this.datetime = timestamp;
    }

    private String returnPathFormat(GreetingType greetingType) {
        return "/" + greetingType.toString().toLowerCase();
    }
}
