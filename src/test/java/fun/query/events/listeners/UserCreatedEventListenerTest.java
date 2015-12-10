package fun.query.events.listeners;

import fun.domains.events.UserCreatedEvent;
import fun.query.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserCreatedEventListenerTest {

    @Mock
    UserRepository users;
    @Test
    public void shouldSaveUser() throws Exception {
        UserCreatedEventListener listener = new UserCreatedEventListener(users);

        listener.on(new UserCreatedEvent());

    }
}