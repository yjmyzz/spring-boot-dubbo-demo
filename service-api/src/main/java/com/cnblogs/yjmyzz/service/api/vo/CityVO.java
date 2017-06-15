package com.cnblogs.yjmyzz.service.api.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by yangjunming on 2017/6/14.
 */
@Data
public class CityVO implements Serializable {

    /**
     * 城市名
     */
    private String cityName;

    /**
     * 所属省的名称
     */
    private String provinceName;


}
