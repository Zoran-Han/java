package com.demo.work.exceptions;

/**
 * 未找到商品异常类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 09:39:00
 */
public class NotFindGoodsException extends Exception {

    public NotFindGoodsException() {

    }

    public NotFindGoodsException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        //判断存在错误信息
        if(super.getMessage()==null) {
            return "错误: 未找到商品!";
        }
        return super.getMessage();
    }

}
