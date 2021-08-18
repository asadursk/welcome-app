package com.example.welcome.services;

import com.example.welcome.models.ResponseDTO;

/**
 * WelcomeService should return greeting of any kind.
 */
public interface WelcomeService {

    /**
     * Should return proper ResponseDTO with official greeting.
     *
     * @param name given name of correspondent
     * @return ResponseDTO with official greeting
     */
    ResponseDTO getOfficialGreeting(String name);

    /**
     * Should return proper ResponseDTO with unofficial greeting.
     *
     * @param name given name of correspondent
     * @return ResponseDTO with unofficial greeting
     */
    ResponseDTO getUnofficialGreeting(String name);
}
