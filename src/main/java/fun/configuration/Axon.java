package fun.configuration;

import fun.domains.model.User;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;


@Configuration
public class Axon extends Default {

    @Bean
    public EventSourcingRepository<User> users(EventStore eventStore, EventBus eventBus){
        EventSourcingRepository<User> users = new EventSourcingRepository<>(User.class, eventStore);
        users.setEventBus(eventBus);
        return users;
    }

    @Bean
    public FeatureManager featureManager(MyFeaturesConfiguration configuration){
        return new FeatureManagerBuilder().
                togglzConfig(configuration).
                build();

    }

}
