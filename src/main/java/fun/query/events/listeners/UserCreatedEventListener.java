package fun.query.events.listeners;

import fun.domains.events.UserCreatedEvent;
import fun.query.repository.UserRepository;
import fun.query.views.UserView;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventhandling.replay.ReplayAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventListener{

    private UserRepository users;

    @Autowired
    public UserCreatedEventListener(UserRepository users) {
        this.users = users;
    }

    @EventHandler
    public void on(UserCreatedEvent userCreatedEvent) {
        UserView user = createFromEvent(userCreatedEvent);
        users.save(user);
    }

    private UserView createFromEvent(UserCreatedEvent userCreatedEvent) {
        return new UserView(userCreatedEvent.getUserId(), userCreatedEvent.getUserName());
    }
}
