package com.Metro.controller;

import com.Metro.dto.User;
import com.Metro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public User getUserById(@PathVariable Long userId){

        return userService.getUserById(userId);
    }
}
