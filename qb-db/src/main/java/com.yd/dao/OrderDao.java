package com.yd.dao;

import com.yd.bo.OrderBO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * TODO
 *
 * @data: 2018/8/8
 * @author: YD
 */
public interface OrderDao extends Mapper<OrderBO> {

    OrderBO findByUid(Long uid);
}
