package com.cnblogs.yjmyzz.service.api;

import com.cnblogs.yjmyzz.service.api.vo.CityVO;

import java.util.List;

/**
 * Created by 菩提树下的杨过(http:/yjmyzz.cnblogs.com) on 2017/5/21.
 */
public interface DemoService {
    String hello(String nickName);

    List<CityVO> getCityList();
}
