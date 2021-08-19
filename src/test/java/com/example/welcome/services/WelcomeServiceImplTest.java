package com.example.welcome.services;

import com.example.welcome.enums.GreetingType;
import com.example.welcome.models.ResponseDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class WelcomeServiceImplTest {

    private static WelcomeService welcomeService;

    @BeforeAll
    public static void setup() {
        String officialGreetingMessage = "Good Morning";
        String unofficialGreetingMessage = "Hello";

        welcomeService = new WelcomeServiceImpl(officialGreetingMessage, unofficialGreetingMessage);
    }

    @Test
    void shouldReturnOfficialGreeting() {
        String expectedGreeting = "Good Morning Edek";
        GreetingType expectedGreetingType = GreetingType.OFFICIAL;
        ResponseDTO response = welcomeService.getOfficialGreeting("Edek");

        Assertions.assertEquals(response.getMessage(), expectedGreeting);
        Assertions.assertEquals(response.getGreetingType(), expectedGreetingType);
    }

    @Test
    void shouldReturnUnofficialGreeting() {
        String expectedGreeting = "Hello Ola";
        GreetingType expectedGreetingType = GreetingType.UNOFFICIAL;

        ResponseDTO response = welcomeService.getUnofficialGreeting("Ola");

        Assertions.assertEquals(response.getMessage(), expectedGreeting);
        Assertions.assertEquals(response.getGreetingType(), expectedGreetingType);
    }
}