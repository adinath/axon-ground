package fun.commands;

import fun.commands.handler.CreateUserCommandHandler;
import fun.domains.events.UserCreatedEvent;
import fun.domains.model.User;
import org.axonframework.test.FixtureConfiguration;
import org.axonframework.test.Fixtures;
import org.junit.Test;

public class CreateUserCommandHandlerTest {


    @Test
    public void shouldCreateUserCreatedEventOnUserCreation() throws Exception {
        FixtureConfiguration<User> fixture = Fixtures.newGivenWhenThenFixture(User.class);

        CreateUserCommandHandler handler = new CreateUserCommandHandler(fixture.getRepository());

        fixture.registerAnnotatedCommandHandler(handler);

        String userId = "userId";
        fixture.
                given().
                when(new CreateUserCommand(userId)).
                expectEvents(new UserCreatedEvent(userId));
    }
}
