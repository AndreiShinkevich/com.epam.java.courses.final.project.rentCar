package com.epam.finalproject.repository;

import com.epam.finalproject.domain.User;
import com.epam.finalproject.enums.UserRole;

import java.util.List;

public class UserRepository {

    public List<User> getAllUser(){
        return List.of(
                new User(1,"andrei","andrei","andrei","an", UserRole.ADMIN),
                new User(2,"alex","alex","alexandr","al", UserRole.USER)
        );

    }
}
