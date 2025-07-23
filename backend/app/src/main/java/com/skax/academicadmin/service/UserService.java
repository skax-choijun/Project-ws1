package com.skax.academicadmin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skax.academicadmin.domain.User;
import com.skax.academicadmin.repository.UserMapper;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
} 