package com.example.medfiz.service;

import com.example.medfiz.dao.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface DataService extends UserDetailsService {
    User getUserById(Long id);
    List<User> getAllUsers();
    void removeUserById(Long id);
    void updateUser(User user);
    void createUser(User user);
    User getUserByLogin(String login);
}
