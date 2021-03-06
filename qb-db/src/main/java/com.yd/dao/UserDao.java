package com.yd.dao;

import com.yd.bo.UserBO;
import com.yd.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import tk.mybatis.mapper.common.Mapper;

/**
 *  用户表
 *
 * @date      2018/8/6
 * @author    YD
 */
public interface UserDao extends JpaRepository<UserBO, Long> {

    /**
     *  根据id获取一个用户
     *
     * @param     id   用户id
     * @date      2018/8/6
     * @author    YD
     * @return    com.yd.bo.UserBO
     */
    UserBO findByUserName(String userName);
}
