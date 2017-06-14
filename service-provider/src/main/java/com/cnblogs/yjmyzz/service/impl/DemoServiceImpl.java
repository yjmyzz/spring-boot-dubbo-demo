package com.cnblogs.yjmyzz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cnblogs.yjmyzz.dao.mapper.CityMapper;
import com.cnblogs.yjmyzz.dao.model.City;
import com.cnblogs.yjmyzz.service.api.DemoService;
import com.cnblogs.yjmyzz.service.api.vo.CityVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 菩提树下的杨过(http:/yjmyzz.cnblogs.com) on 2017/5/21.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    CityMapper cityMapper;

    public String hello(String nickName) {
        logger.info(nickName + " call me!");
        return String.format("hi , %s!", nickName);
    }

    @Override
    public List<CityVO> getCityList() {
        List<City> list = cityMapper.selectAll();
        List<CityVO> result = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            for (City c : list) {
                CityVO v = new CityVO();
                v.setCityName(c.getName());
                v.setProvinceName(c.getState());
                result.add(v);
            }
        }
        return result;
    }


}
