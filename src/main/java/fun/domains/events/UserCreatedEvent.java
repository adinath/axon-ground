package fun.domains.events;

public class UserCreatedEvent {
    private String userId;
    private String userName;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(String id, String userName) {

        this.userId = id;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
