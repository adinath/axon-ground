package fun.query.views;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class UserView {

    @Id
    private String userId;
    private String userName;
    private Date dateOfBirth;

    public UserView(String userId, String userName, Date dateOfBirth) {

        this.userId = userId;
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
