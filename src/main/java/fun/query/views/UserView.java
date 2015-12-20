package fun.query.views;

import org.springframework.data.annotation.Id;

public class UserView {

    @Id
    private String userId;
    private String userName;

    public UserView(String userId, String userName) {

        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
