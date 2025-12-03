package com.tesco.integration.hcm_jda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Mono<User> getUser(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/employees")
    public List<User> getUsers() {
        return List.of(new User(1l,"ramu",21),new User(2l,"rahul",32),new User(3l,"raja",45));
    }

}
