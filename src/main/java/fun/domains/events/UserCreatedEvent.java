package fun.domains.events;

public class UserCreatedEvent {
    private String userId;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(String userId) {

        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
