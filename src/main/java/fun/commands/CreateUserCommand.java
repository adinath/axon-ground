package fun.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

public class CreateUserCommand {
    @TargetAggregateIdentifier
    private String id;
    private String userName;

    public CreateUserCommand() {
    }

    public CreateUserCommand(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
