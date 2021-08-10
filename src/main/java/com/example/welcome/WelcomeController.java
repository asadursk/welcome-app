package com.example.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/official")
    @ResponseBody
    public CustomResponse officialGreeting(@RequestParam String name) {
        return new CustomResponse(welcomeService.officialGreeting(name), "/official");
    }

    @GetMapping("/unofficial")
    public CustomResponse unofficialGreeting(@RequestParam String name) {
        return new CustomResponse(welcomeService.unofficialGreeting(name), "/unofficial");
    }
}
