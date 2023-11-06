package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(Long userId);
    List<User> getAllUsers();
    void deleteUser(Long userId);
}
