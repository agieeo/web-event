package com.example.myweb.service.impl;

import com.example.myweb.mapper.UserMapper;
import com.example.myweb.pojo.User;
import com.example.myweb.service.UserService;
import com.example.myweb.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
        //密码要加密处理
        String md5String = Md5Util.getMD5String(password);
        userMapper.add(username,password);
    }
}
