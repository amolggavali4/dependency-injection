package springframework.guru.dependencyinjection.controller;

import org.springframework.stereotype.Controller;
import springframework.guru.dependencyinjection.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){

        return greetingService.sayGreeting();
    }
}
