package com.demo.apis;

import java.util.UUID;

/**
 * UUID生成36位随机字符串
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月05日 14:38:43
 */
public class TestUUID {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        System.out.println(uuidStr);
        System.out.println(uuidStr.length());
    }

}
