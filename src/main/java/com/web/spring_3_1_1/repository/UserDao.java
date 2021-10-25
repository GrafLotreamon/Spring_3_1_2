package com.web.spring_3_1_1.repository;

import com.web.spring_3_1_1.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void delete(Long id);

    void update(User updatedUser);

    User getUserById(Long id);

    List<User> getAllUsers();

    User getUserByUsername(String username);

}
