package com.demo.api;

import java.util.UUID;

/**
 * @ClassName TestUUID
 * 生成36位的随机字符串
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月05日  14:39:04
 * @Version 1.0.0
 */

public class TestUUID {

    public static void main(String[]  args) {
        /**
         * 随机生成UUID对象
         */
        StringBuffer s = new StringBuffer();
        UUID uuid = UUID.randomUUID();
        String uuidStr1 =uuid.toString();
        String uuidStr2 = uuidStr1.replace("-","");

        System.out.println(uuidStr1);
        System.out.println(uuidStr2);
    }

}
