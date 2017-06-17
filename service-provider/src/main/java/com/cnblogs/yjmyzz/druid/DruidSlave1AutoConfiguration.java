package com.cnblogs.yjmyzz.druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


@EnableConfigurationProperties(DruidSlave1Properties.class)
@ConditionalOnProperty(prefix = "druid.slave1", name = "url")
public class DruidSlave1AutoConfiguration extends AbstractDruidAutoConfiguration {

    @Autowired
    private DruidSlave1Properties slave1Properties;

    @Bean("dsSlave1")
    public DataSource dsSlave1() {
        return buildDataSource(slave1Properties);
    }


}
