package com.yd.bo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user")
public class UserBO {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
}
