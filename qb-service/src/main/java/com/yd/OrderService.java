package com.yd;

import com.yd.bo.OrderBO;

/**
 * TODO
 *
 * @data: 2018/8/8
 * @author: YD
 */
public interface OrderService {

    OrderBO findByUid(Long uid);

}
