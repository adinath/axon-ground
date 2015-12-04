package fun.web;


import fun.configuration.MyFeatures;
import fun.domains.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class UserController {

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> users() {
        return Collections.emptyList();
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> addUser(@RequestBody String userName) {
        System.out.println("userName = " + userName);
        if (MyFeatures.CAN_CREATE_USER.isActive()) {
            return status(HttpStatus.OK).build();
        } else {
            return status(HttpStatus.FORBIDDEN).build();
        }
    }
}
