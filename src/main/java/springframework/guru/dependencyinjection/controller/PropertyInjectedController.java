package springframework.guru.dependencyinjection.controller;

import org.springframework.stereotype.Controller;
import springframework.guru.dependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
