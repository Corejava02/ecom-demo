package com.ecom.ecomdemo.controller;

import com.ecom.ecomdemo.entity.UserEntity;
import com.ecom.ecomdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("add-user")
    public void addUserData(@RequestBody UserEntity user){
        userService.addUser(user);
    }

    @GetMapping("all")
    public List<UserEntity> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("users")
    public List<UserEntity> getFilteredUsers(@RequestParam(value = "name") String name){
        return userService.getAllFilteredUsers(name);
    }
}
