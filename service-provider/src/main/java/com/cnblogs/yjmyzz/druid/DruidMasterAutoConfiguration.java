package com.cnblogs.yjmyzz.druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@EnableConfigurationProperties(DruidMasterProperties.class)
@ConditionalOnProperty(prefix = "druid.master", name = "url")
public class DruidMasterAutoConfiguration extends AbstractDruidAutoConfiguration {

    @Autowired
    private DruidMasterProperties masterProperties;

    @Bean("dsMaster")
    @Primary
    public DataSource dsMaster() {
        return buildDataSource(masterProperties);
    }


}
