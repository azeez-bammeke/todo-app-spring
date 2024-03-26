package com.todo.service;

import com.todo.model.User;
import com.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String save(User user) {
        User savedUser = userRepository.save(user);
        return savedUser.getUserId();
    }

    @Override
    public List<User> getUsersByFirstName(String firstName) {
        return userRepository.findByFirstNameStartsWith(firstName);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


    @Override
    public User deleteUserByUserId(String id) {
        return userRepository.deleteUserByUserId(id);
    }
}