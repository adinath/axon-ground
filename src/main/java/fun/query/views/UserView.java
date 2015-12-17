package fun.query.views;

import org.springframework.data.annotation.Id;

public class UserView {

    @Id
    private String userId;

    public UserView(String userId) {

        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
