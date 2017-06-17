package com.cnblogs.yjmyzz.datasource;

/**
 * Created by yangjunming on 2017/6/17.
 */
public class DBContext {

    private static final ThreadLocal<String> tlDbKey = new ThreadLocal<String>();

    private static final ThreadLocal<Boolean> isWrite = new ThreadLocal<>();

    public static Boolean isWriteMode() {
        return isWrite.get() == null ? false : isWrite.get();
    }

    public static void setIsWrite(Boolean value) {
        isWrite.set(value);
    }

    public static String getDBKey() {
        return tlDbKey.get();
    }

    public static void setDBKey(String dbKey) {
        tlDbKey.set(dbKey);
    }

    public static void clear() {
        tlDbKey.remove();
        isWrite.remove();
    }


}
