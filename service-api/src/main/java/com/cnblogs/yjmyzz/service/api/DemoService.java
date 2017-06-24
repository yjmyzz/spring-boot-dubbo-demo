package com.cnblogs.yjmyzz.service.api;

import com.cnblogs.yjmyzz.service.api.vo.CityVO;
import com.cnblogs.yjmyzz.service.api.vo.ProductVO;

import java.util.List;

/**
 * Created by 菩提树下的杨过(http:/yjmyzz.cnblogs.com) on 2017/5/21.
 */
public interface DemoService {
    String hello(String nickName);

    List<CityVO> getCityList1(int pageIndex, int pageSize);


    List<CityVO> getCityList2(int pageIndex, int pageSize);


    ProductVO getProduct1();

    ProductVO getProduct2();
}
