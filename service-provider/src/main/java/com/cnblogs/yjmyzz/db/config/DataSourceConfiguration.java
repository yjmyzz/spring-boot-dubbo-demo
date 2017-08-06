package com.cnblogs.yjmyzz.db.config;

/**
 * Created by jimmy on 6/18/17.
 */

import com.cnblogs.yjmyzz.db.datasource.DbContextHolder;
import com.cnblogs.yjmyzz.db.datasource.MasterSlaveRoutingDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

    @Value("${druid.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name = "studyMasterDataSource")
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

    @Bean(name = "dataSource")
    @Primary
    public AbstractRoutingDataSource dataSource() {
        MasterSlaveRoutingDataSource proxy = new MasterSlaveRoutingDataSource();
        Map<Object, Object> targetDataResources = new HashMap<>();
        targetDataResources.put(DbContextHolder.DbType.PRODUCT_MASTER, productMasterDataSource());
        targetDataResources.put(DbContextHolder.DbType.PRODUCT_SLAVE, productSlaveDataSource1());
        targetDataResources.put(DbContextHolder.DbType.STUDY_MASTER, studyMasterDataSource());
        targetDataResources.put(DbContextHolder.DbType.STUDY_SLAVE, studySlaveDataSource1());
        proxy.setDefaultTargetDataSource(productMasterDataSource());
        proxy.setTargetDataSources(targetDataResources);
        proxy.afterPropertiesSet();
        return proxy;
    }

}