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
@Entity
@NameStyle(Style.camelhumpAndLowercase)
@Table(name = "order")
@Data
public class OrderBO {

    @Id
    private Integer uid;

    private Integer saleAmound;

}
