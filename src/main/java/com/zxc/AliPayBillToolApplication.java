package com.zxc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuxc
 * 支付宝账单工具
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.zxc.mapper"})
public class AliPayBillToolApplication {
    public static void main(String[] args) {
        SpringApplication.run(AliPayBillToolApplication.class, args);
    }
}
