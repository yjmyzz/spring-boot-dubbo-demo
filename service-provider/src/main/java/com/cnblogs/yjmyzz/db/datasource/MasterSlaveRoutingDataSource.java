package com.cnblogs.yjmyzz.db.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class MasterSlaveRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        return DbContextHolder.getDbType();
    }
}