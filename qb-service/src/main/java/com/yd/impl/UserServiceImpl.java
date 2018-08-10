package com.yd.impl;

import com.yd.UserService;
import com.yd.bo.UserBO;
import com.yd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserBO findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }


}
