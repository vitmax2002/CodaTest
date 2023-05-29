package coda.controller;

import coda.model.User;
import coda.service.UserDto;
import coda.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> showUsers()
    {
        return userService.showAll();
    }


   // @PutMapping("/user/update/{id}")
   // public User updateUser(@PathVariable int id, @RequestBody User user)
   // {
   ///    return userService.update(id,user);
   // }

    @PostMapping("/user/add")
    public User addUser(@RequestBody UserDto user)
    {
        return userService.addUser(user);
    }
}
