package com.example.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/official")
    public ResponseDTO officialGreeting(@RequestParam String name) {
        return new ResponseDTO(welcomeService.officialGreeting(name), "/official");
    }

    @GetMapping("/unofficial")
    public ResponseDTO unofficialGreeting(@RequestParam String name) {
        return new ResponseDTO(welcomeService.unofficialGreeting(name), "/unofficial");
    }
}
