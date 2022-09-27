package com.example.medfiz.service;

import com.example.medfiz.dao.entity.User;
import com.example.medfiz.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(String.valueOf(id))
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void removeUserById(Long id) {
        userRepository.deleteById(String.valueOf(id));
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByLogin(username);
    }
}