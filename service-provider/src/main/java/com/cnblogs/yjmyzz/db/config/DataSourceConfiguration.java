package com.cnblogs.yjmyzz.db.config;

/**
 * Created by jimmy on 6/18/17.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

    @Value("${druid.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name = "studyMasterDataSource")
    @Primary
    @ConfigurationProperties(prefix = "druid.study.master")
    public DataSource studyMasterDataSource() {
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "studySlaveDataSource")
    @ConfigurationProperties(prefix = "druid.study.slave")
    public DataSource studySlaveDataSource1() {
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "productMasterDataSource")
    @ConfigurationProperties(prefix = "druid.product.master")
    public DataSource productMasterDataSource() {
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "productSlaveDataSource")
    @ConfigurationProperties(prefix = "druid.product.slave")
    public DataSource productSlaveDataSource1() {
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

}