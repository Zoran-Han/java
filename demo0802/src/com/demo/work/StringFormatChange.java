package com.demo.work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 把前面的格式转换成后面的格式。
 *    ttt5yjd-jdd4yh      tttyyyyyjd@jddyyyyh
 *    Hsdkf4sd-fsd3tr    Hsdkfssssd@fsd3tttr
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月02日 10:20:22
 */
public class StringFormatChange {

    /**
     * 格式转换
     * @param value
     * @return
     */
    public String changeFormat(String value) {
        //创建字符缓冲区
        StringBuffer stuff = new StringBuffer(value);
        //创建表达式对象、匹配器
        Pattern pattern = Pattern.compile("\\d+[A-Za-z]");
        Matcher matcher = pattern.matcher(stuff.toString());
        //循环查找子序列
        while(matcher.find()) {
            //System.out.println(matcher.group(0)+"  "+matcher.start()+","+matcher.end());
            //获取子序列
            String sub = matcher.group(0);
            //提取数字
            int count = Integer.parseInt(sub.substring(0, sub.length()-1));
            //提取字符
            char c = sub.charAt(sub.length()-1);
            /*//提取出左部字符串与右部字符串
            String left = value.substring(0, matcher.start());
            String right = value.substring(matcher.end());
            //循环拼接格式化后的子序列
            for(int i=0; i<count; i++) {
                left += c;
            }
            value = left+right;*/

            //获得插入字符的开始位置
            int startIndex = matcher.start();
            //删除子序列
            stuff.delete(startIndex, matcher.end());
            //循环插入字符
            for(int i=0; i<count; i++) {
                stuff.insert(startIndex+i, c);
            }
            //System.out.println(stuff);
            //重置匹配器对象
            matcher = pattern.matcher(stuff.toString());
        }
        return stuff.toString();
    }

    public static void main(String[] args) {
        StringFormatChange sfc = new StringFormatChange();
        System.out.println(sfc.changeFormat("Hsdkf4sd-11fsd3tr6A"));
        System.out.println("abc".substring(3)); //截取字符串下标为长度时，运行不会报错，但是返回空字符串("")
        //int i = Integer.parseInt("12.04"); //运行时出错
    }

}
