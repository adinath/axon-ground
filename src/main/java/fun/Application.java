package fun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.togglz.core.context.StaticFeatureManagerProvider;
import org.togglz.core.manager.FeatureManager;

@SpringBootApplication
@ComponentScan("fun")
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "fun.query.repository")
public class Application {

    public static void main(String... args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        FeatureManager featureManager = context.getBean(FeatureManager.class);
        StaticFeatureManagerProvider.setFeatureManager(featureManager);
    }
}
