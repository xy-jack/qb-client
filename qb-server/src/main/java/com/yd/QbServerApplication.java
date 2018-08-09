package com.yd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  服务端启动入口
 *
 * @date      2018/7/31
 * @author    YD
 */
@SpringBootApplication
@MapperScan(basePackages = "com.yd.dao")
public class QbServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QbServerApplication.class, args);
    }
}
