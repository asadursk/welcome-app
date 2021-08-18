package com.example.welcome.controllers;

import com.example.welcome.models.ResponseDTO;
import com.example.welcome.services.WelcomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/welcome")
public class WelcomeController {
    private WelcomeService welcomeService;

    @GetMapping("/official")
    public ResponseDTO officialGreeting(@RequestParam String name) {
        return welcomeService.getOfficialGreeting(name);
    }

    @GetMapping("/unofficial")
    public ResponseDTO unofficialGreeting(@RequestParam String name) {
        return welcomeService.getUnofficialGreeting(name);
    }
}
