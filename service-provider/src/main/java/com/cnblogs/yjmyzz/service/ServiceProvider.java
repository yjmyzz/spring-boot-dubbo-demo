package com.cnblogs.yjmyzz.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yangjunming on 2017/5/21.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableAspectJAutoProxy
@ComponentScan("com.cnblogs.yjmyzz")
@MapperScan(basePackages = "com.cnblogs.yjmyzz.dao.mapper")
public class ServiceProvider {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider.class, args);
    }
}
