package com.example.welcome;

import lombok.Getter;
import java.sql.Timestamp;
import java.util.Date;

@Getter
public class ResponseDTO {
    private final String content;

    private final Timestamp datetime;

    private final String endpoint;

    ResponseDTO(String content, String endpoint) {
        Date date = new Date();

        this.content = content;
        this.endpoint = endpoint;
        this.datetime = new Timestamp(date.getTime());
    }
}
