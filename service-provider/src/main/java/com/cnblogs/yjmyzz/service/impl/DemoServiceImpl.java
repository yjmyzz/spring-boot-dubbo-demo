package com.cnblogs.yjmyzz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cnblogs.yjmyzz.service.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 菩提树下的杨过(http:/yjmyzz.cnblogs.com) on 2017/5/21.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String hello(String nickName) {
        logger.info(nickName + " call me!");
        return String.format("hi , %s!", nickName);
    }
}
