package com.example.malljack.service.impl;

import com.example.malljack.domain.User;
import com.example.malljack.mapper.UserMapper;
import com.example.malljack.service.IUserService;
import com.example.malljack.utils.Sha256Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(User user) {
        String sha256Pwd = Sha256Util.getSha256(user.getPassword());
        User userTemp = new User();
        userTemp.setPassword(sha256Pwd);
        userTemp.setUsername(user.getUsername());
        userMapper.register(userTemp);
    }
}
