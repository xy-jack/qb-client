package com.yd.controller;

import com.yd.OrderService;
import com.yd.bo.OrderBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @data: 2018/8/8
 * @author: YD
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getOrder/{uid}")
    public OrderBO getOrder(@PathVariable Long uid) {
        System.out.println(">>>>>>>>>>>uid:"+uid);
        return orderService.findByUid(uid);
    }
}
