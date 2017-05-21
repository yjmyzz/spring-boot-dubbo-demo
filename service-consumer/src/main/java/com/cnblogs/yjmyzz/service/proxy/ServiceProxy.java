package com.cnblogs.yjmyzz.service.proxy;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cnblogs.yjmyzz.service.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by yangjunming on 2017/5/21.
 */
@Component
public class ServiceProxy {

    @Reference(version = "1.0.0")
    public DemoService demoService;
}
