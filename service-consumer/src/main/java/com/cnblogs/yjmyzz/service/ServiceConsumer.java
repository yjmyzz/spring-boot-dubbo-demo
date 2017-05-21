package com.cnblogs.yjmyzz.service;

import com.cnblogs.yjmyzz.service.proxy.ServiceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by 菩提树下的杨过(http:/yjmyzz.cnblogs.com) on 2017/5/21.
 */
@SpringBootApplication
public class ServiceConsumer {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ServiceConsumer.class, args);
        ServiceProxy proxy = ctx.getBean(ServiceProxy.class);
        System.out.println(proxy.demoService.hello("菩提树下的杨过"));
    }
}
