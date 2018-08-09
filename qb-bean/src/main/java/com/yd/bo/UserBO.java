package com.yd.bo;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class UserBO {

    private Long id;
    private String userName;
    private String password;
}
