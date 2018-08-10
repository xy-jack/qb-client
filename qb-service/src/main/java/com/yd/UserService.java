package com.yd;

import com.yd.bo.UserBO;

import java.util.List;

public interface UserService {

    /**
     * 查询用户列表
     * @return
     */
    List<UserBO> listUser();

    /**
     * 根据用户名查找用户信息
     * @param userName  用户名
     * @return
     */
    UserBO findByUserName(String userName);

    /**
     * 保存用户信息
     * @param user  user对象
     * @return
     */
    Integer saveUser(UserBO user);

    /**
     * 更新用户信息
     * @param user  user对象
     * @return
     */
    Integer updateUser(UserBO user);

}
