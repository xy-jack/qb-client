package com.yd.bo;

import com.yd.base.BaseBO;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "m_user")
public class UserBO extends BaseBO {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户名
     */
    //@Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    //@Column(name = "password")
    private String password;

    /**
     * 最近登录时间
     */
    //@Column(name = "recently_login_time")
    private Date recentlyLoginTime;
}
