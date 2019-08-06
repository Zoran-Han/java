package com.demo.work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName DatabasePool
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月05日  18:49:19
 * @Version 1.0.0
 */

public class DatabasePool {

    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    private static String minSize;
    private static String maxSize;
    private static String timeout;
    private static String maxStatement;

    //创建属性列表的对象
    private  static Properties properties = new Properties();

    //静态块初始化
    static {
        driverClass = "connection.driverClass";
        url="connection.url";
        username="connection.username";
        password="connection.password";
        minSize="connection.minSize";
        maxSize="connection.maxSize";
        timeout="connection.timeout";
        maxStatement="connection.maxStatement";
    }

    public static String getDriverClass() {
        return properties.getProperty("connection.driverClass");
    }

    public static void setDriverClass(String driverClass) {
        DatabasePool.driverClass = driverClass;
    }

    public static String getUrl() {
        return properties.getProperty("connection.url");
    }

    public static void setUrl(String url) {
        DatabasePool.url = url;
    }

    public static String getUsername() {
        return properties.getProperty("connection.username");
    }

    public static void setUsername(String username) {
        DatabasePool.username = username;
    }

    public static String getPassword() {
        return properties.getProperty("connection.password");
    }

    public static void setPassword(String password) {
        DatabasePool.password = password;
    }

    public static String getMinSize() {
        return properties.getProperty("connection.minSize");
    }

    public static void setMinSize(String minSize) {
        DatabasePool.minSize = minSize;
    }

    public static String getMaxSize() {
        return properties.getProperty("connection.maxSize");
    }

    public static void setMaxSize(String maxSize) {
        DatabasePool.maxSize = maxSize;
    }

    public static String getTimeout() {
        return properties.getProperty("connection.timeout");
    }

    public static void setTimeout(String timeout) {
        DatabasePool.timeout = timeout;
    }

    public static String getMaxStatement() {
        return properties.getProperty("connection.maxStatement");
    }

    public static void setMaxStatement(String maxStatement) {
        DatabasePool.maxStatement = maxStatement;
    }

    public static void main(String[]  args) {

        try {

            //加载属性文件
            properties.load(new FileInputStream("src/com/demo/work/Data.properties"));
            //获取属性
            System.out.println(DatabasePool.getDriverClass());
            System.out.println(DatabasePool.getUrl());
            System.out.println(DatabasePool.getUsername());
            System.out.println(DatabasePool.getPassword());
            System.out.println(DatabasePool.getMinSize());
            System.out.println(DatabasePool.getMaxSize());
            System.out.println(DatabasePool.getTimeout());
            System.out.println(DatabasePool.getMaxStatement());

            properties.setProperty(username,"韩志荣");
            properties.setProperty(password,"hzr123456");

            //保存在文件中
            properties.store(new FileOutputStream("src/com/demo/work/Data.properties"),"数据库连接信息");
            System.out.println("连接信息已更新！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
