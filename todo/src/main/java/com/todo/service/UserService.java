package com.todo.service;

import com.todo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    String save(User user);

    List<User> getUsersByFirstName(String firstName);

    User deleteUserByUserId(String id);
    List<User> getAllUser();
}
