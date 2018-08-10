package com.yd.controller;

import com.yd.UserService;
import com.yd.bo.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户表
 *
 * @data: 2018/8/8
 * @author: YD
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{userName}")
    public UserBO getOrder(@PathVariable String userName) {
        return userService.findByUserName(userName);
    }
}
