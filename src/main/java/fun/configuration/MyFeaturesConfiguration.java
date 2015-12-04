package fun.configuration;


import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.user.UserProvider;

import java.io.File;

@Component
public class MyFeaturesConfiguration implements TogglzConfig {
    @Override
    public Class<? extends Feature> getFeatureClass() {
        return MyFeatures.class;
    }

    @Override
    public StateRepository getStateRepository() {
        File file = new File("src/main/resources/feature.properties");
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        return new FileBasedStateRepository(file);
    }

    @Override
    public UserProvider getUserProvider() {
        return new NoOpUserProvider();
    }
}
