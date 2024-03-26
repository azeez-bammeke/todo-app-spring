package com.todo.repository;

import com.todo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User save(User user);
    List<User> findByFirstNameStartsWith(String firstName);

    List<User> findAll();

    User deleteUserByUserId(String id);
}
