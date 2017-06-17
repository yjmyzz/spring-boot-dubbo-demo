package com.cnblogs.yjmyzz.druid;

import lombok.Data;

/**
 * Created by yangjunming on 2017/6/17.
 */
@Data
public abstract class AbstractDruidProperties {

    private String url;
    private String username;
    private String password;
    private String driverClass;

    private int maxActive;
    private int minIdle;
    private int initialSize;
    private boolean testOnBorrow;
}
