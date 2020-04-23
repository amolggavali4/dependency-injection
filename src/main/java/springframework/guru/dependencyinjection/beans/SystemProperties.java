package springframework.guru.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("file:/home/amol/myprop.properties")
public class SystemProperties {
    @Autowired
    private Environment environment;
    @Value("${dummy}")
    private String myprop;
    public String getEnvironment() {
        return environment.toString();
    }
    public String getJavaHome(){
        return  environment.getProperty("JAVA_HOME");
    }

    public String getMyprop() {
        return myprop;
    }

    public void setMyprop(String myprop) {
        this.myprop = myprop;
    }
}
