package springframework.guru.dependencyinjection.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframework.guru.dependencyinjection.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}