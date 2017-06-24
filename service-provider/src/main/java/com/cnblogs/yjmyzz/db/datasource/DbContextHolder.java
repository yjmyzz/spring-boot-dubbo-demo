package com.cnblogs.yjmyzz.db.datasource;

public class DbContextHolder {

    public enum DbType {
        STUDY_MASTER, STUDY_SLAVE, PRODUCT_MASTER, PRODUCT_SLAVE
    }

    private static final ThreadLocal<DbType> contextHolder = new ThreadLocal<>();

    public static void setDbType(DbType dbType) {
        if (dbType == null) throw new NullPointerException();
        contextHolder.set(dbType);
    }

    public static DbType getDbType() {
        return contextHolder.get() == null ? DbType.PRODUCT_MASTER : contextHolder.get();
    }

    public static void clearDbType() {
        contextHolder.remove();
    }

}

