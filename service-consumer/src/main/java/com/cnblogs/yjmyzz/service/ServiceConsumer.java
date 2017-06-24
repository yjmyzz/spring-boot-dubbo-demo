package com.cnblogs.yjmyzz.service;

import com.cnblogs.yjmyzz.service.api.vo.CityVO;
import com.cnblogs.yjmyzz.service.api.vo.ProductVO;
import com.cnblogs.yjmyzz.service.proxy.ServiceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

/**
 * Created by 菩提树下的杨过(http:/yjmyzz.cnblogs.com) on 2017/5/21.
 */
@SpringBootApplication
public class ServiceConsumer {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ServiceConsumer.class, args);
        ServiceProxy proxy = ctx.getBean(ServiceProxy.class);
        System.out.println(proxy.demoService.hello("菩提树下的杨过"));//调用服务

        //study主、从库测试
        List<CityVO> list = proxy.demoService.getCityList1(1, 2);
        for (CityVO o : list) {
            System.out.println(o.toString());
        }

        System.out.println("-------------------------------------");

        list = proxy.demoService.getCityList2(1, 2);
        for (CityVO o : list) {
            System.out.println(o.toString());
        }

        System.out.println("-------------------------------------");

        //product主、从库测试
        ProductVO vo = proxy.demoService.getProduct1();
        System.out.println(vo.toString());

        System.out.println("-------------------------------------");

        vo = proxy.demoService.getProduct2();
        System.out.println(vo.toString());
    }
}
