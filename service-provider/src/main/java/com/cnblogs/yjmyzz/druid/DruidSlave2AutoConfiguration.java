package com.cnblogs.yjmyzz.druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


@EnableConfigurationProperties(DruidSlave2Properties.class)
@ConditionalOnProperty(prefix = "druid.slave2", name = "url")
public class DruidSlave2AutoConfiguration extends AbstractDruidAutoConfiguration {

    @Autowired
    private DruidSlave2Properties slave2Properties;

    @Bean("dsSlave2")
    public DataSource dsSlave2() {
        return buildDataSource(slave2Properties);
    }


}
