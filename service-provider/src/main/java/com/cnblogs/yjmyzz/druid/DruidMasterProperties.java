package com.cnblogs.yjmyzz.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "druid.master")
public class DruidMasterProperties extends AbstractDruidProperties {

}
