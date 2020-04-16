package springframework.guru.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedControllerServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!! -- Constructor injected";
    }
}
