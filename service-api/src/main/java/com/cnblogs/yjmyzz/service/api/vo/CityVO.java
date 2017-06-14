package com.cnblogs.yjmyzz.service.api.vo;

/**
 * Created by yangjunming on 2017/6/14.
 */
public class CityVO {

    /**
     * 城市名
     */
    private String cityName;

    /**
     * 所属省的名称
     */
    private String provinceName;


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "CityVO{" +
                "cityName='" + cityName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
