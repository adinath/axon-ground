package fun.query.events.listeners;

import fun.domains.events.UserCreatedEvent;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserCreatedEventListenerTest {

    @Test
    public void shouldSaveUser() throws Exception {
        UserCreatedEventListener listener = new UserCreatedEventListener();

        listener.on(new UserCreatedEvent());

    }
}