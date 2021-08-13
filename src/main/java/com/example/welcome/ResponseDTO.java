package com.example.welcome;

import lombok.Getter;
import java.sql.Timestamp;
import java.util.Date;

@Getter
public class ResponseDTO {
    private final String content;

    private final Timestamp datetime;

    private final String endpoint;

    ResponseDTO(String content, GreetingType greetingType) {
        Date date = new Date();

        this.content = content;
        this.endpoint = endpointFormat(greetingType);
        this.datetime = new Timestamp(date.getTime());
    }

    private String endpointFormat(GreetingType greetingType) {
        return "/" + greetingType.toString().toLowerCase();
    }
}
