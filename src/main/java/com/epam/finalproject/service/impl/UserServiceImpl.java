package com.epam.finalproject.service.impl;

import com.epam.finalproject.domain.User;
import com.epam.finalproject.repository.UserRepository;
import com.epam.finalproject.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }
}
