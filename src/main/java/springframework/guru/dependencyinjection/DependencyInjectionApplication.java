package springframework.guru.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.guru.dependencyinjection.beans.FakeDataSource;
import springframework.guru.dependencyinjection.controller.ConstructorInjectedController;
import springframework.guru.dependencyinjection.controller.I18nController;
import springframework.guru.dependencyinjection.controller.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        ConstructorInjectedController controller = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(controller.getGreeting());

        MyController myController =(MyController) ctx.getBean("myController");
        System.out.println(myController.sayGreeting());

        System.out.println("------Profile testing");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("checking fake datasource");
        FakeDataSource fds = (FakeDataSource) ctx.getBean("fakeDataSource");
        System.out.println(fds.getUser() + "/" + fds.getPassword() + "/" + fds.getDbUrl());
    }

}
