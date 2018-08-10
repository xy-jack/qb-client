package com.yd.base;

import lombok.Data;

import java.util.Date;

/**
 * 基础BO
 *
 * @data: 2018/8/10
 * @author: YD
 */
@Data
public class BaseBO {
    private Long id;
    private Date createTime;
    private Date updateTime;
}
