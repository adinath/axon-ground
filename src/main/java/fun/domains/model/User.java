package fun.domains.model;

import fun.domains.events.UserCreatedEvent;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.axonframework.eventsourcing.annotation.EventSourcingHandler;

public class User extends AbstractAnnotatedAggregateRoot {

    @AggregateIdentifier
    private String userId;

    public User() {
    }

    public User(String userId) {
        apply(new UserCreatedEvent(userId));
    }

    @EventSourcingHandler
    public void on(UserCreatedEvent event) {
        this.userId = event.getUserId();
    }
}
