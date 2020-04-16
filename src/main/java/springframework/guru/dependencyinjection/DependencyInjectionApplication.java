package springframework.guru.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.guru.dependencyinjection.controller.ConstructorInjectedController;
import springframework.guru.dependencyinjection.controller.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        ConstructorInjectedController controller = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(controller.getGreeting());

        MyController myController =(MyController) ctx.getBean("myController");
        System.out.println(myController.sayGreeting());
    }

}
