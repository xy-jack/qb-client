package com.yd.impl;

import com.yd.UserService;
import com.yd.bo.UserBO;
import com.yd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserBO getUser(Long id) {
        return userDao.getUser(id);
    }

}
