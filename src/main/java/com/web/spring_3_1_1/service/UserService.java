package com.web.spring_3_1_1.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.web.spring_3_1_1.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    void deleteUser(Long id);

    void update(User updatedUser);

    User getUserById(Long id);

    List<User> getAllUsers();
}
