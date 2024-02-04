package com.example.myweb.service;

import com.example.myweb.pojo.User;

public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);
}
