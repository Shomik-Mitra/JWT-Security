package com.rentRead.controller;

import com.rentRead.entity.User;
import com.rentRead.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/hello")
    public String getHelloWorld(HttpServletRequest httpServletRequest){
        return "Hello World  "+httpServletRequest.getSession().getId();
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUser(@RequestBody User user){
         return this.userService.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        System.out.println(user);
        return userService.verify(user);

    }
    @GetMapping("/user")
    public String getUser(){
        return "Hello, User";
    }
    @GetMapping("/admin")
    public String getAdmin(){
        return "Hello, Admin";
    }
}
