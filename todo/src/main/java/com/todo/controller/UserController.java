package com.todo.controller;

import com.todo.model.User;
import com.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        String userId = userService.save(user);

        return ResponseEntity.status( HttpStatus.OK)
                .body("Sign up success full: " + userId);
    }

    @GetMapping("/by-name")
    public ResponseEntity<List<User>> getUsersByFirstName(@RequestParam String firstName) {
        List<User> userList = userService.getUsersByFirstName(firstName);

        return ResponseEntity.status( HttpStatus.OK)
                .body(userList);
    }

    @GetMapping("/all-user")
    public ResponseEntity<List<User>> getUsers() {
        List<User> userList = userService.getAllUser();

        return ResponseEntity.status( HttpStatus.OK)
                .body(userList);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam String userId) {
       User deletedUser =  userService.deleteUserByUserId(userId);
       return ResponseEntity.status(HttpStatus.OK)
               .body("User Id: " + deletedUser.getUserId() + " Deleted successfully");
    }
}
