package fun.web.request;

import java.util.Date;

public class AddUserRequest {

    private final String userName;

    private final Date dateOfBirth;

    public AddUserRequest() {
        this(null, null);
    }

    public AddUserRequest(String userName, Date dateOfBirth) {
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
