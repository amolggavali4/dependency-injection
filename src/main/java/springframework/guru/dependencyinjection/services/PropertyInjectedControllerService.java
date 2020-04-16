package springframework.guru.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedControllerService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!! - Property injected service";
    }
}
