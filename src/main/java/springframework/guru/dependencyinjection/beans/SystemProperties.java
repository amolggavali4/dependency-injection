package springframework.guru.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SystemProperties {
    @Autowired
    private Environment environment;

    public String getEnvironment() {
        return environment.toString();
    }
    public String getJavaHome(){
        return  environment.getProperty("JAVA_HOME");
    }

}
