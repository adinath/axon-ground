package fun.domains.events;

import java.util.Date;

public class UserCreatedEvent {
    private String userId;
    private String userName;
    private Date dateOfBirth;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(String id, String userName, Date dateOfBirth) {

        this.userId = id;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
