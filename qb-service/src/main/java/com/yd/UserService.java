package com.yd;

import com.yd.bo.UserBO;

public interface UserService {

    UserBO findByUserName(String userName);
}
