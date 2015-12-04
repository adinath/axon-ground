package fun.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

public class CreateUserCommand {
    @TargetAggregateIdentifier
    private String id;

    public CreateUserCommand() {
    }

    public CreateUserCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
