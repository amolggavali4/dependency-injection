package springframework.guru.dependencyinjection.controller;

import org.springframework.stereotype.Controller;
import springframework.guru.dependencyinjection.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
