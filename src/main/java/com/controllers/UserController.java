package com.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.User;
import com.services.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
 @PostMapping
 public User addUser(@RequestBody User newuser) {
     
     return userService.addUser(newuser);
 }
 @PutMapping("/{id}")
 public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
    return userService.updateUser(id, updatedUser);
 }
 
 @DeleteMapping("/{id}")
 public boolean deleteUser(@PathVariable int id) {
    return userService.deleteUser(id);
 }    
}
    
