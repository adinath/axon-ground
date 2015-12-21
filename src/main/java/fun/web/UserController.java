package fun.web;


import fun.commands.CreateUserCommand;
import fun.configuration.MyFeatures;
import fun.domains.model.User;
import fun.query.repository.UserRepository;
import fun.query.views.UserView;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.springframework.http.ResponseEntity.badRequest;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class UserController {

    @Autowired
    CommandGateway commandGateway;

    @Autowired
    UserRepository users;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> users() {
        return Collections.emptyList();
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> registerUser(@RequestBody String userName) {
        if (MyFeatures.CAN_CREATE_USER.isActive()) {
            UUID userId = UUID.randomUUID();
            commandGateway.send(new CreateUserCommand(userId.toString(),userName));
            return ok().body(userId);
        } else {
            return badRequest().build();
        }
    }

    @RequestMapping(value = "/api/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getUser(@PathVariable String userId){
        UserView user = users.findOne(userId);
        if(user == null){
            return notFound().build();
        }else{
            return ok().body(user);
        }
    }
}
