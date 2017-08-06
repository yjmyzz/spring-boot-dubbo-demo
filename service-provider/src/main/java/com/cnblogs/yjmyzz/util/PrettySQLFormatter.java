package com.cnblogs.yjmyzz.util;

import org.hibernate.engine.jdbc.internal.FormatStyle;

public class PrettySQLFormatter {

    public static void print(String sql) {
        System.out.println(FormatStyle.BASIC.getFormatter().format(sql));
    }


    public static void print(String remark, String sql) {
        System.out.println(remark
                + FormatStyle.BASIC.getFormatter().format(sql));
    }


    public static String getPrettySql(String sql) {
        return FormatStyle.BASIC.getFormatter().format(sql);
    }


    public static String getPrettySql(String remark, String sql) {
        return remark + FormatStyle.BASIC.getFormatter().format(sql);
    }

    public static void main(String[] args) {
        System.out.println(getPrettySql("select * from MyUser as A join MyFriend as B on A.id = B.pid where B.name like ? "));
    }
}