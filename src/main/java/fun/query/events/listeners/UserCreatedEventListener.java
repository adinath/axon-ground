package fun.query.events.listeners;

import fun.domains.events.UserCreatedEvent;
import fun.query.views.UserView;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventListener {

    @EventHandler
    public void on(UserCreatedEvent userCreatedEvent) {
        UserView user = createFromEvent(userCreatedEvent);
    }

    private UserView createFromEvent(UserCreatedEvent userCreatedEvent) {
        return new UserView(userCreatedEvent.getUserId());
    }
}
