package fun.commands.handler;

import fun.commands.CreateUserCommand;
import fun.domains.model.User;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateUserCommandHandler {


    private Repository<User> users;

    @Autowired
    public CreateUserCommandHandler(Repository<User> users) {
        this.users = users;
    }

    @CommandHandler
    public void on(CreateUserCommand command){

        users.add(new User(command.getId(),
                command.getUserName(),
                command.getDateOfBirth()));
    }
}
