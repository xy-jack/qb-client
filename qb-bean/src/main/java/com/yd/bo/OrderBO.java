package com.yd.bo;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO
 *
 * @data: 2018/8/8
 * @author: YD
 */
@NameStyle(Style.camelhumpAndLowercase)
@Table(name = "order")
public class OrderBO {

    @Id
    private Integer uid;

    private Integer saleAmound;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSaleAmound() {
        return saleAmound;
    }

    public void setSaleAmound(Integer saleAmound) {
        this.saleAmound = saleAmound;
    }
}
