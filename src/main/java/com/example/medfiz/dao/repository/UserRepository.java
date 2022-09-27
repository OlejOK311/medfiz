package com.example.medfiz.dao.repository;

import com.example.medfiz.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    @Query("select u from User u")
    List<User> getAllUsers();

    User findByLogin(String login);
}
