package com.yd.impl;

import com.yd.OrderService;
import com.yd.bo.OrderBO;
import com.yd.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @data: 2018/8/8
 * @author: YD
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public OrderBO findByUid(Long uid) {
        return orderDao.findByUid(uid);
    }
}
